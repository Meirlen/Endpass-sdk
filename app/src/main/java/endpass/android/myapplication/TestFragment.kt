package endpass.android.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import endpass.android.endpass_sdk.gateway.entity.oauth.PostOauthTokenResponse
import endpass.android.endpass_sdk.presentation.router.MainRouter
import endpass.android.endpass_sdk.presentation.ui.document.CameraActivity
import kotlinx.android.synthetic.main.fragment_test.*


class TestFragment : androidx.fragment.app.Fragment() {

    private lateinit var router: MainRouter

    companion object {

        const val OAUTH_GET_TOKEN_REQUEST_CODE = 1802
        const val EXTRA_OAUTH_TOKEN_RESPONSE = "key"

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()
        initView()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {

            if (requestCode == OAUTH_GET_TOKEN_REQUEST_CODE) {

                val response =
                    data?.getParcelableExtra<PostOauthTokenResponse>(EXTRA_OAUTH_TOKEN_RESPONSE)
                toast(response?.access_token.toString())
                //startActivity(ResultActivity.getStartIntent(context!!, response!!))
            }
        }

    }

    private fun initView() {
        router = MainRouter()
        button.setDisable(false)
    }

    private fun setListeners() {
        button.setOnClickListener {
            router.openLogin(context)
        }
        loginBtn.setOnClickListener {
            router.openOauth(this)
        }

    }


}
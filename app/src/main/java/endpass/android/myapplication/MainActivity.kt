package endpass.android.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import endpass.android.endpass_sdk.App
import endpass.android.endpass_sdk.presentation.router.MainRouter
import endpass.android.endpass_sdk.presentation.ui.HomeActivity
import endpass.android.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchFragment(0)
    }


    private fun switchFragment(position: Int) {
        supportFragmentManager.replaceOnce(R.id.frame_container, position.toString(), {
            TestFragment()
        }).commit()
    }


}

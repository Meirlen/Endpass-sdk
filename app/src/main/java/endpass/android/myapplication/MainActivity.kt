package endpass.android.myapplication

import android.icu.util.LocaleData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import endpass.android.endpass_sdk.presentation.ext.toast
import endpass.android.endpass_sdk.presentation.ui.document.CameraActivity
import endpass.android.endpass_sdk.presentation.ui.home.DocFlowViewModel
import endpass.android.endpass_sdk.presentation.utils.AppSingleton

class MainActivity : AppCompatActivity() {

    //val docFlowViewModel:DocFlowViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast(AppSingleton.clientId.toString())
        CameraActivity

    }
}

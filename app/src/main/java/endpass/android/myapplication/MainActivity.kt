package endpass.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import endpass.android.endpass_sdk.presentation.ext.toast
import endpass.android.endpass_sdk.presentation.utils.AppSingleton
import endpass.android.endpass_sdk.presentation.utils.LocalData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast(AppSingleton.clientId.toString())
    }
}

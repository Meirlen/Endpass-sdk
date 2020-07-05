package endpass.android.endpass_sdk.presentation.router

import android.content.Context
import androidx.fragment.app.Fragment
import endpass.android.endpass_sdk.gateway.EnumCollections
import endpass.android.endpass_sdk.gateway.entity.DocumentHolder
import endpass.android.endpass_sdk.presentation.ui.HomeActivity
import endpass.android.endpass_sdk.presentation.auth.password.ChangePassActivity
import endpass.android.endpass_sdk.presentation.auth.AuthActivity
import endpass.android.endpass_sdk.gateway.entity.login.LoginExtraData
import endpass.android.endpass_sdk.presentation.base.Constant
import endpass.android.endpass_sdk.presentation.base.Constant.TAKE_PHOTO_REQUEST_CODE
import endpass.android.endpass_sdk.presentation.auth.OauthActivity
import endpass.android.endpass_sdk.presentation.ui.cropper.CropperActivity
import endpass.android.endpass_sdk.presentation.ui.document.CameraActivity
import endpass.android.endpass_sdk.presentation.ui.document.DocumentActivity


class MainRouter {


    fun openLogin(context: Context?, flow: Int = EnumCollections.AuthFlowType.AUTH.ordinal) {
        context?.let {
            it.startActivity(AuthActivity.getStartIntent(it, flow))
        }
    }

    fun openOauth(fragment: Fragment) {
        fragment.context?.let {
            fragment.startActivityForResult(
                OauthActivity.getStartIntent(it),
                Constant.OAUTH_GET_TOKEN_REQUEST_CODE
            )
        }
    }

    fun openLogin(fragment: Fragment, flow: Int = EnumCollections.AuthFlowType.AUTH.ordinal) {
        fragment.context?.let {
            fragment.startActivityForResult(
                AuthActivity.getStartIntent(it, flow),
                Constant.OAUTH_REQUEST_CODE
            )
        }
    }

    fun openHome(context: Context?, screen: Int, loginExtraData: LoginExtraData?) {
        context?.let {
            it.startActivity(HomeActivity.getStartIntent(it, screen, loginExtraData))
        }
    }

    fun changePassword(context: Context?, loginExtraData: LoginExtraData?) {
        context?.let {
            it.startActivity(ChangePassActivity.getStartIntent(it, loginExtraData))
        }
    }


    fun openDocument(
        fragment: Fragment,
        documentHolder: DocumentHolder,
        isTakePhoto: Boolean = true
    ) {

        fragment.context?.let {
            fragment.startActivityForResult(
                DocumentActivity.getStartIntent(it, documentHolder, isTakePhoto),
                Constant.VERIFIED_DOCUMENT_CODE
            )
        }

    }


    fun openCameraActivity(fragment: Fragment, isFrontSide: Boolean = true) {
        fragment.context?.let {
            fragment.startActivityForResult(
                CameraActivity.getStartIntent(it, isFrontSide),
                TAKE_PHOTO_REQUEST_CODE
            )
        }

        /* fragment.context?.let {
             fragment.startActivityForResult(
                 CropperActivity.getStartIntent(it, isFrontSide),
                 TAKE_PHOTO_REQUEST_CODE
             )
         }*/
    }


    fun openCropActivity(fragment: Fragment, isFrontSide: Boolean = true) {
        fragment.context?.let {
            fragment.startActivityForResult(
                CropperActivity.getStartIntent(it, isFrontSide),
                TAKE_PHOTO_REQUEST_CODE
            )
        }
    }
}
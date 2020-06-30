package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.oauth.PostOauthConsentResponse
import io.reactivex.Single
import javax.inject.Inject

class PostOauthConsentUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<PostOauthConsentResponse, PostOauthConsentUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<PostOauthConsentResponse> =
        loginRepository.postConsent(params)

    data class Params(
        val challenge: String,
        val grantScopes: ArrayList<String>
    )
}
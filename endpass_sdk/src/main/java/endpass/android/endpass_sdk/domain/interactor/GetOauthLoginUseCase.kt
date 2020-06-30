package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.oauth.OauthLoginResponse
import io.reactivex.Single
import javax.inject.Inject

class GetOauthLoginUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<OauthLoginResponse, GetOauthLoginUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<OauthLoginResponse> =
        loginRepository.oauthLogin(params)

    data class Params(
        val challenge: String
    )
}
package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.oauth.PostOauthTokenResponse
import io.reactivex.Single
import javax.inject.Inject

class PostOauthTokenUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<PostOauthTokenResponse, PostOauthTokenUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<PostOauthTokenResponse> =
        loginRepository.oauthPostToken(params)

    data class Params(
        val grant_type: String,
        val code: String,
        val client_id: String,
        val code_verifier: String,
        val  oauthBaseUrl:String

    )

}
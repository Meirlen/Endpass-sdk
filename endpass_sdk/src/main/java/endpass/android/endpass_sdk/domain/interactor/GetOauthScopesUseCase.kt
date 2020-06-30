package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.oauth.ConsentResponse
import io.reactivex.Single
import javax.inject.Inject

class GetOauthScopesUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<ConsentResponse, GetOauthScopesUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<ConsentResponse> =
        loginRepository.getScopes(params)

    data class Params(
        val id: String
    )
}
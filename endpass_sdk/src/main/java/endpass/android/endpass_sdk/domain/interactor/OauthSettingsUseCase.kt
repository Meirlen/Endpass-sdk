package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.oauth.OauthSettingsResponse
import io.reactivex.Single
import javax.inject.Inject

class OauthSettingsUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<OauthSettingsResponse, OauthSettingsUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<OauthSettingsResponse> =
        loginRepository.oauthSettings(params)

    data class Params(
        val client_id: String?
    )
}
package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import io.reactivex.Single
import javax.inject.Inject

class GetOauthConsentUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<String, GetOauthConsentUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<String> =
        loginRepository.getConsent(params)

    data class Params(
        val url: String
    )
}
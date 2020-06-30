package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.login.LoginResponse
import io.reactivex.Single
import javax.inject.Inject


class LoginUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<LoginResponse, LoginUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<LoginResponse> =
        loginRepository.login(params)

    data class Params(
        val email: String? = null
    )
}
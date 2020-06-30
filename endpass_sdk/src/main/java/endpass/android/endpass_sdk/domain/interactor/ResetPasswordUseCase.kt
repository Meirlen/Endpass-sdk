package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.resetPass.ResetPassResponse
import io.reactivex.Single
import javax.inject.Inject

class ResetPasswordUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<ResetPassResponse, ResetPasswordUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<ResetPassResponse> =
        loginRepository.resetPassword(params)

    data class Params(
        val email: String? = null
    )
}
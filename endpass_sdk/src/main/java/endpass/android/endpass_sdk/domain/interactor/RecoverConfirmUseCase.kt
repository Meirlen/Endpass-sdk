package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.recover.RecoverConfirmResponse
import io.reactivex.Single
import javax.inject.Inject

class RecoverConfirmUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<RecoverConfirmResponse, RecoverConfirmUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<RecoverConfirmResponse> =
        loginRepository.confirmRecover(params)

    data class Params(
        val email: String,
        val code: String
    )
}
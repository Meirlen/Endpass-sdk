package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.recover.RecoverResponse
import io.reactivex.Single
import javax.inject.Inject

class RecoverUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<RecoverResponse, RecoverUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<RecoverResponse> =
        loginRepository.recover(params)

    data class Params(
        val email: String? = null
    )
}
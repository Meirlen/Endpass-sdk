package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.check.CheckResponse
import io.reactivex.Single
import javax.inject.Inject

class CheckPasswordUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<CheckResponse, CheckPasswordUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<CheckResponse> =
        loginRepository.check(params)

    data class Params(
        val email: String? = null
    )
}
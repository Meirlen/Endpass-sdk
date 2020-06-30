package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import endpass.android.endpass_sdk.gateway.entity.code.CodeResponse
import io.reactivex.Single
import javax.inject.Inject

class RequestCodeUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<CodeResponse, RequestCodeUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<CodeResponse> =
        loginRepository.requestCode(params)

    data class Params(
        val email: String? = null
    )
}
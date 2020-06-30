package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.LoginRepository
import io.reactivex.Single
import javax.inject.Inject

class GetRedirectUrlUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    SingleUseCase<String, GetRedirectUrlUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<String> =
        loginRepository.getRedirectUrls(params)

    data class Params(
        val url: String
    )
}
package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.MainRepository
import endpass.android.endpass_sdk.gateway.entity.documents.DocumentResponse
import io.reactivex.Single
import javax.inject.Inject

class GetDocumentsUseCase @Inject constructor(private val mainRepository: MainRepository) :
    SingleUseCase<DocumentResponse, GetDocumentsUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<DocumentResponse> =
        mainRepository.documents(params)

    data class Params(
        val email: String? = null
    )
}
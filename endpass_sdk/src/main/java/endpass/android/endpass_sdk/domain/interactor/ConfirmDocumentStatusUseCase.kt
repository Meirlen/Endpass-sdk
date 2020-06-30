package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.MainRepository
import endpass.android.endpass_sdk.gateway.entity.documents.DocumentFlowResponse
import io.reactivex.Single
import javax.inject.Inject

class ConfirmDocumentStatusUseCase @Inject constructor(private val mainRepository: MainRepository) :
    SingleUseCase<DocumentFlowResponse, ConfirmDocumentStatusUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<DocumentFlowResponse> =
        mainRepository.confirm(params)

    data class Params(
        val documentId: String
    )
}


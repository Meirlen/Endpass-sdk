package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.MainRepository
import endpass.android.endpass_sdk.gateway.entity.documents.DocumentFlowResponse
import io.reactivex.Single
import javax.inject.Inject

class DeleteDocumentUseCase @Inject constructor(private val mainRepository: MainRepository) :
    SingleUseCase<DocumentFlowResponse, DeleteDocumentUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<DocumentFlowResponse> =
        mainRepository.deleteDocument(params)

    data class Params(
        val documentId: String,
        val code: String
    )
}


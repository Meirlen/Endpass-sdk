package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.MainRepository
import endpass.android.endpass_sdk.gateway.EnumCollections
import endpass.android.endpass_sdk.gateway.entity.documents.CheckDocumentResponse
import io.reactivex.Single
import javax.inject.Inject

class AddDocumentUseCase @Inject constructor(private val mainRepository: MainRepository) :
    SingleUseCase<CheckDocumentResponse, AddDocumentUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<CheckDocumentResponse> =
        mainRepository.addDocument(params)

    data class Params(
        val type: EnumCollections.DocumentType
    )
}


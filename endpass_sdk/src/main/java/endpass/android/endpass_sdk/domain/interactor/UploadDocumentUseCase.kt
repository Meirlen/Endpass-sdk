package com.example.domain.interactor

import com.example.domain.base.SingleUseCase
import com.example.domain.repository.MainRepository
import endpass.android.endpass_sdk.gateway.entity.documents.CheckDocumentResponse
import io.reactivex.Single
import javax.inject.Inject

class UploadDocumentUseCase @Inject constructor(private val mainRepository: MainRepository) :
    SingleUseCase<CheckDocumentResponse, UploadDocumentUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<CheckDocumentResponse> =
        mainRepository.uploadDocument(params)

    data class Params(
        val path: String,
        val idDocument: String,
        val isFrontSide: Boolean
    )
}


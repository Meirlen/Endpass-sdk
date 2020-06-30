package com.example.domain.exception

/**
 * Exception for app server errors
 */
open class ServerException(val errorMessage: String, val code: Int) : RuntimeException(errorMessage)
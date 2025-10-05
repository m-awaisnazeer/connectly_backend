package com.communisol.user.domain.model

import java.util.UUID

typealias UserId = UUID

data class User(
    val id: UserId,
    val userName: String,
    val mail: String,
    val hasEmailVerified: Boolean,
)
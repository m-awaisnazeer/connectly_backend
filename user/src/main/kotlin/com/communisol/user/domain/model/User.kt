package com.communisol.com.communisol.user.domain.model

import org.hibernate.validator.constraints.UUID

typealias UserId = UUID

data class User(
    val id: UserId,
    val userName: String,
    val mail: String,
    val hasEmailVerified: Boolean,

)
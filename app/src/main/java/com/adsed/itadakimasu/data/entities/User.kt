package com.adsed.itadakimasu.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    var email: String = "",
    var username: String = "",
    var password: String = ""
)
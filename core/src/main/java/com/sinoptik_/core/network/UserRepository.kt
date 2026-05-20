package com.sinoptik_.core.network

import com.sinoptik_.core.exam_practice.User

interface UserRepository {
    fun getUsers(): List<User>
}
package com.sinoptik_.feature_home

import com.sinoptik_.core.exam_practice.User
import com.sinoptik_.core.network.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor() : UserRepository {
    override fun getUsers() = listOf(User("QQQ"), User("WWW"), User("EEE"))
}
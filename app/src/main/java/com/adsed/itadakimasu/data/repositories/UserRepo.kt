package com.adsed.itadakimasu.data.repositories

import android.app.Application
import com.adsed.itadakimasu.data.AppDatabase
import com.adsed.itadakimasu.data.entities.User

class UserRepo(application: Application) {

    private val userDao = AppDatabase.getTestInstance(application)!!.userDao()

    fun getUserById(userId: Long) = userDao.getUserById(userId)

    fun getUsers() = userDao.getUsers()

    fun insertUser(user: User) = userDao.insertUser(user)

    fun updateUser(user: User) = userDao.updateUser(user)

    fun deleteUser(user: User) = userDao.deleteUser(user)
}
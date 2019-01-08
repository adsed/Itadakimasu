package com.adsed.itadakimasu.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.adsed.itadakimasu.data.entities.User

@Dao
interface UserDao {

    @Query("SELECT * FROM User WHERE id = :userId")
    fun getUserById(userId: Long): LiveData<User>

    @Query("SELECT * FROM User")
    fun getUsers(): LiveData<List<User>>

    @Insert
    fun insertUser(user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)
}
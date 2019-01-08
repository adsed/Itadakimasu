package com.adsed.itadakimasu.data

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.adsed.itadakimasu.data.dao.UserDao
import com.adsed.itadakimasu.data.entities.User

@Database(
    entities = [
        User::class
    ], version = 0, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        var instance: AppDatabase? = null

        fun getInstance(application: Application): AppDatabase? {
            if (instance == null) {
                synchronized(AppDatabase::class.java) {
                    instance = Room.databaseBuilder(
                        application,
                        AppDatabase::class.java,
                        "itadakimasu.db"
                    ).build()
                }
            }
            return instance
        }

        fun getTestInstance(application: Application): AppDatabase? {
            if (instance == null) {
                synchronized(AppDatabase::class.java) {
                    instance = Room.inMemoryDatabaseBuilder(
                        application,
                        AppDatabase::class.java
                    ).build()
                }
            }
            return instance
        }
    }
}
package com.wsayan.ballet.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wsayan.ballet.db.dao.ImageConfigDao
import com.wsayan.ballet.db.entity.ImagesConfig


@Database(entities = [ImagesConfig::class], version = 1, exportSchema = false)
abstract class RoomDB : RoomDatabase() {

    abstract fun imageConfigDao(): ImageConfigDao
}
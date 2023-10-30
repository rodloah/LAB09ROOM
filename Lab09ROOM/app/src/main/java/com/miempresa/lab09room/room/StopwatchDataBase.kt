package com.miempresa.lab09room.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.miempresa.lab09room.model.Stopwatch

@Database(entities = [Stopwatch::class],version=1, exportSchema = false)
abstract class StopwatchDataBase:RoomDatabase() {
    abstract fun stopDao():StopwatchDataDao
}
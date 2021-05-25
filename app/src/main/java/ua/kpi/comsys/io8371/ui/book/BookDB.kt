package ua.kpi.comsys.io8371.ui.book

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [BookEntity::class], version = 3)
abstract class BookDB : RoomDatabase() {
    abstract fun getBookDAO(): BookDAO
}
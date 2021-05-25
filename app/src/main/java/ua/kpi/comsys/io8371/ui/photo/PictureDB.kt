package ua.kpi.comsys.io8371.ui.photo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ImageEntity::class], version = 1)
abstract class PictureDB : RoomDatabase() {
    abstract fun getImageTestDao(): ImageDAO
}
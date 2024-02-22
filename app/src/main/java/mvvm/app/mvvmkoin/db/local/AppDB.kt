package mvvm.app.mvvmkoin.db.local

import androidx.room.Database
import androidx.room.RoomDatabase
import mvvm.app.mvvmkoin.db.local.model.todoEntity


@Database(entities = [todoEntity::class], version = 1, exportSchema = false)
abstract class AppDB : RoomDatabase() {
    abstract fun itemDao(): RoomDoa
}
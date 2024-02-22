package mvvm.app.mvvmkoin.db.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mvvm.app.mvvmkoin.db.local.model.todoEntity
import mvvm.app.mvvmkoin.db.remote.model.todoData
@Dao
interface RoomDoa {
    @Query("SELECT * FROM todos")
    fun getTodos(): Flow<List<todoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todos: List<todoEntity>)
}
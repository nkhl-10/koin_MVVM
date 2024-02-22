package mvvm.app.mvvmkoin.db.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class todoEntity(
    @PrimaryKey val todoId: Int,
    val userId:String,
    val id:String,
    val title :String,
    val completed:Boolean
)

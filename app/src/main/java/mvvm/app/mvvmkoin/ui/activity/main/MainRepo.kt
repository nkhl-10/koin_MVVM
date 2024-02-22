package mvvm.app.mvvmkoin.ui.activity.main

import android.util.Log
import kotlinx.coroutines.flow.Flow
import mvvm.app.mvvmkoin.db.local.RoomDoa
import mvvm.app.mvvmkoin.db.local.model.todoEntity
import mvvm.app.mvvmkoin.db.remote.ApiService

class MainRepo(
    private val todoDoa:RoomDoa,
    private val api:ApiService
) {
    fun getTodo():Flow<List<todoEntity>>{
        return todoDoa.getTodos()
    }

    suspend fun fetchTodo(){
        try {
            val todoData =api.getItems()
            todoDoa.insertTodo(todoData)
        }catch (e:Exception){
            Log.i("ex",e.toString())
        }
    }
}
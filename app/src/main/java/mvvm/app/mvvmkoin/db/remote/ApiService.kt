package mvvm.app.mvvmkoin.db.remote

import mvvm.app.mvvmkoin.db.local.model.todoEntity
import mvvm.app.mvvmkoin.db.remote.model.todoData
import retrofit2.http.GET

interface ApiService{

    @GET("todos")
    suspend fun getItems(): List<todoEntity>
}
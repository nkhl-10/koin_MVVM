package mvvm.app.mvvmkoin.ui.activity.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mvvm.app.mvvmkoin.db.local.model.todoEntity

class MainVM(
    private val repo:MainRepo
):ViewModel()
{

    val todos: LiveData<List<todoEntity>> = repo.getTodo().asLiveData()


    fun fetchData(){
        viewModelScope.launch {
            repo.fetchTodo()
        }
    }
}
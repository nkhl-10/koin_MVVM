package mvvm.app.mvvmkoin.di

import androidx.room.Room
import mvvm.app.mvvmkoin.db.local.AppDB
import mvvm.app.mvvmkoin.db.remote.ApiService
import mvvm.app.mvvmkoin.ui.activity.main.MainRepo
import mvvm.app.mvvmkoin.ui.activity.main.MainVM
import mvvm.app.mvvmkoin.utils.AppConstant
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDB::class.java, "app-database"
        ).build()
    }
    single { get<AppDB>().itemDao() }
}

val networkModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(AppConstant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single { get<Retrofit>().create(ApiService::class.java) }
}

val repositoryModule = module {
    single { MainRepo(get(), get()) }
}

val viewModelModule = module {
    viewModel { MainVM(get()) }
}

package mvvm.app.mvvmkoin

import android.app.Application
import mvvm.app.mvvmkoin.di.databaseModule
import mvvm.app.mvvmkoin.di.networkModule
import mvvm.app.mvvmkoin.di.repositoryModule
import mvvm.app.mvvmkoin.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(
                databaseModule,
                networkModule,
                repositoryModule,
                viewModelModule
            ))
        }
    }
}
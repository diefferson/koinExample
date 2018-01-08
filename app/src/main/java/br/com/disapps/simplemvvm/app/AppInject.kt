package br.com.disapps.simplemvvm.app

import android.app.Application
import android.arch.persistence.room.Room
import br.com.disapps.simplemvvm.BuildConfig
import br.com.disapps.simplemvvm.api.IRestApi
import br.com.disapps.simplemvvm.db.AppDB
import br.com.disapps.simplemvvm.ui.home.HomeViewModel
import br.com.disapps.simplemvvm.ui.login.LoginViewModel
import br.com.disapps.simplemvvm.ui.main.MainViewModel
import br.com.disapps.simplemvvm.util.LiveDataCallAdapterFactory
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by diefferson on 28/11/2017.
 */
object AppInject {

    fun modules() : List<Module> = listOf(
            appModule, viewModelModule
    )

    val appModule: Module = applicationContext {
        provide { provideApp() }
        provide { provideIRestApi() }
        provide { provideDb(get()) }
    }

    val viewModelModule = applicationContext {
        viewModel { HomeViewModel(get()) }
        viewModel { LoginViewModel() }
        viewModel { MainViewModel() }
    }

    private fun provideApp(): App = App.instance!!

    private fun provideIRestApi(): IRestApi {
        return Retrofit.Builder()
                .baseUrl(BuildConfig.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(LiveDataCallAdapterFactory())
                .build()
                .create(IRestApi::class.java)
    }

    private fun provideDb(app: Application): AppDB =
            Room.databaseBuilder(app, AppDB::class.java, "vivamais.db").build()
}
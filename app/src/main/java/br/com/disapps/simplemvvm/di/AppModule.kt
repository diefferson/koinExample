package br.com.disapps.simplemvvm.di

import android.app.Application
import android.arch.persistence.room.Room
import br.com.disapps.simplemvvm.BuildConfig
import br.com.disapps.simplemvvm.api.IRestApi
import br.com.disapps.simplemvvm.app.App
import br.com.disapps.simplemvvm.db.AppDB
import br.com.disapps.simplemvvm.util.LiveDataCallAdapterFactory
import org.koin.android.module.AndroidModule
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by diefferson santos on 15/12/2017.
 */
class  AppModule : AndroidModule(){

    override fun context() = applicationContext{
        provide { provideApp() }
        provide { provideIRestApi() }
        provide { provideDb(get()) }
    }

    fun provideApp(): App = App.instance!!

    fun provideIRestApi(): IRestApi {
        return Retrofit.Builder()
                .baseUrl(BuildConfig.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(LiveDataCallAdapterFactory())
                .build()
                .create(IRestApi::class.java)
    }

    fun provideDb(app: Application): AppDB =
            Room.databaseBuilder(app, AppDB::class.java, "vivamais.db").build()

}
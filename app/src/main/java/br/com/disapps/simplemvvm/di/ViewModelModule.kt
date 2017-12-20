package br.com.disapps.simplemvvm.di

import android.arch.lifecycle.ViewModel
import br.com.disapps.simplemvvm.api.IRestApi
import br.com.disapps.simplemvvm.db.AppDB
import br.com.disapps.simplemvvm.ui.main.MainViewModel
import br.com.disapps.simplemvvm.ui.home.HomeViewModel
import br.com.disapps.simplemvvm.ui.login.LoginViewModel
import br.com.disapps.simplemvvm.util.ViewModelFactory
import org.koin.dsl.module.applicationContext

/**
 * Created by diefferson Santos on 15/12/2017.
 */
object ViewModelModule{

    val viewModelModule = applicationContext {
        provide { provideViewModels(get(), get()) }
        provide { ViewModelFactory(get()) }
    }

    private fun provideViewModels(iRestApi: IRestApi, appDB: AppDB): Map<Class<out ViewModel>, ViewModel> {
       return mapOf(
               HomeViewModel::class.java to HomeViewModel(iRestApi),
               LoginViewModel::class.java to LoginViewModel(),
               MainViewModel::class.java to MainViewModel()
       )
    }
}

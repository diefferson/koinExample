package br.com.disapps.simplemvvm.di

import android.arch.lifecycle.ViewModel
import br.com.disapps.simplemvvm.api.IRestApi
import br.com.disapps.simplemvvm.db.AppDB
import br.com.disapps.simplemvvm.ui.main.MainViewModel
import br.com.disapps.simplemvvm.ui.home.HomeViewModel
import br.com.disapps.simplemvvm.ui.login.LoginViewModel
import org.koin.android.module.AndroidModule

/**
 * Created by dnso on 15/12/2017.
 */

class ViewModelModule : AndroidModule(){

    override fun context() = applicationContext {
        provide { provideViewModels(get(), get()) }
        provide { ViewModelFactory(get()) }
    }

    fun provideViewModels(iRestApi: IRestApi, appDB: AppDB): Map<Class<out ViewModel>, ViewModel> {
       return mapOf(
               HomeViewModel::class.java to HomeViewModel(iRestApi),
               LoginViewModel::class.java to LoginViewModel(),
               MainViewModel::class.java to MainViewModel()
       )
    }
}

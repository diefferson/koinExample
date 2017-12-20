package br.com.disapps.simplemvvm.di

import android.arch.lifecycle.ViewModel
import br.com.disapps.simplemvvm.ui.main.MainViewModel
import br.com.disapps.simplemvvm.ui.home.HomeViewModel
import br.com.disapps.simplemvvm.ui.login.LoginViewModel
import org.koin.android.module.AndroidModule

/**
 * Created by dnso on 15/12/2017.
 */

class ViewModelModule : AndroidModule(){

    override fun context() = applicationContext {
        provide { provideViewModels() }
        provide { ViewModelFactory(get()) }
    }


    fun provideViewModels(): Map<Class<out ViewModel>, ViewModel> {
       return mapOf(
               HomeViewModel::class.java to HomeViewModel(),
               LoginViewModel::class.java to LoginViewModel(),
               MainViewModel::class.java to MainViewModel()

       )
    }


}

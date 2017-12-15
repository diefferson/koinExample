package br.com.disapps.simplemvvm.di

import br.com.disapps.simplemvvm.MainViewModel
import br.com.disapps.simplemvvm.ui.home.HomeViewModel
import br.com.disapps.simplemvvm.ui.login.LoginViewModel
import org.koin.android.module.AndroidModule

/**
 * Created by dnso on 15/12/2017.
 */

class ViewModelModule : AndroidModule(){

    override fun context() = applicationContext {
        provide { HomeViewModel() }
        provide { LoginViewModel() }
        provide { MainViewModel() }
    }
}

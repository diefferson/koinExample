package br.com.disapps.simplemvvm.di

import br.com.disapps.simplemvvm.ui.main.MainActivity
import org.koin.android.module.AndroidModule

/**
 * Created by dnso on 15/12/2017.
 */
class ActivityModule : AndroidModule(){
    override fun context() = applicationContext {
        provide { MainActivity() }
    }
}
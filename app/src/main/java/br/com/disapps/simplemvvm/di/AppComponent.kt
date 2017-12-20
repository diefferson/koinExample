package br.com.disapps.simplemvvm.di

import org.koin.android.module.AndroidModule

/**
 * Created by diefferson on 28/11/2017.
 */
object AppComponent{
    fun modules() : List<AndroidModule> {
        return  listOf(AppModule(), ViewModelModule())
    }
}
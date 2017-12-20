package br.com.disapps.simplemvvm.di

import org.koin.dsl.module.Module

/**
 * Created by diefferson on 28/11/2017.
 */
object AppComponent{
    fun modules() : List<Module> = listOf(
            AppModule.module,
            ViewModelModule.module
    )
}
package br.com.disapps.simplemvvm.app

import android.app.Application
import android.support.v7.app.AppCompatDelegate
import org.koin.android.ext.android.startKoin


/**
 * Created by diefferson on 28/11/2017.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        instance = this

        startKoin(this, AppInject.modules())
    }

    companion object {
        var instance: App? = null
            private set
    }
}
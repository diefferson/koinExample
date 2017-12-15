package br.com.disapps.simplemvvm.di

import br.com.disapps.simplemvvm.ui.home.HomeFragment
import org.koin.android.module.AndroidModule

/**
 * Created by dnso on 15/12/2017.
 */
class FragmentModule : AndroidModule(){

    override fun context() = applicationContext {
        provide { HomeFragment() }
    }

}
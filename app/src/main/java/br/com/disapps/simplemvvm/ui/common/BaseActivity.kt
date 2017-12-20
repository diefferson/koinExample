package br.com.disapps.simplemvvm.ui.common

import android.arch.lifecycle.ViewModel
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.disapps.simplemvvm.di.ViewModelFactory
import org.koin.android.ext.android.inject

/**
 * Created by diefferson on 29/11/2017.
 */
abstract class BaseActivity<out V: ViewModel> : AppCompatActivity() {

    abstract val mViewModel: V
    abstract val activityTag: String
    abstract val activityName: String
    abstract val activityLayout: Int

    val viewModelFactory by inject<ViewModelFactory>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityLayout)
    }



}
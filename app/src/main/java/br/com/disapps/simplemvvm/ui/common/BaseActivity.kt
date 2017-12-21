package br.com.disapps.simplemvvm.ui.common

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.disapps.simplemvvm.util.ViewModelFactory
import org.koin.android.ext.android.inject

/**
 * Created by diefferson on 29/11/2017.
 */
abstract class BaseActivity : AppCompatActivity() {

    abstract val viewModelClass: Class<out ViewModel>
    abstract val activityTag: String
    abstract val activityName: String
    abstract val activityLayout: Int

    private val viewModelFactory: ViewModelFactory by inject()

    val mViewModel: ViewModel by lazy { ViewModelProviders.of(this, viewModelFactory).get(viewModelClass)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityLayout)
    }
}
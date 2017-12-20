package br.com.disapps.simplemvvm.ui.common

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.disapps.simplemvvm.di.ViewModelFactory
import org.koin.android.ext.android.inject

/**
 * Created by diefferson on 29/11/2017.
 */
abstract class BaseFragment<out V: ViewModel> : Fragment() {

    abstract val mViewModel: V
    abstract val fragmentTag: String
    abstract val fragmentName: String
    abstract val fragmentLayout: Int
    val viewModelFactory by inject<ViewModelFactory>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater!!.inflate(fragmentLayout, container, false)

}
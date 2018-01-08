package br.com.disapps.simplemvvm.ui.home

import android.os.Bundle
import br.com.disapps.simplemvvm.R
import br.com.disapps.simplemvvm.ui.common.BaseFragment
import org.koin.android.architecture.ext.getViewModel

/**
 * Created by diefferson on 29/11/2017.
 */

class HomeFragment : BaseFragment(){

    companion object {
        fun newInstance() = HomeFragment()
    }
    override val fragmentTag: String
        get() = HomeFragment::class.java.simpleName

    override val fragmentName: String
        get() = getString(R.string.home)

    override val fragmentLayout: Int
        get() = R.layout.fragment_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = getViewModel<HomeViewModel>()
    }

}

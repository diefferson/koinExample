package br.com.disapps.simplemvvm.ui.home

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import br.com.disapps.homepet.util.extensions.toast
import br.com.disapps.simplemvvm.R
import br.com.disapps.simplemvvm.di.InjectionTest
import br.com.disapps.simplemvvm.ui.common.BaseFragment
import org.koin.android.ext.android.inject

/**
 * Created by diefferson on 29/11/2017.
 */

class HomeFragment : BaseFragment<HomeViewModel>(){

    companion object {
        fun newInstance() = HomeFragment()
    }

    override val mViewModel: HomeViewModel
        get() =  ViewModelProviders.of(this).get(HomeViewModel::class.java)

    override val fragmentTag: String
        get() = HomeFragment::class.java.simpleName

    override val fragmentName: String
        get() = getString(R.string.home)

    override val fragmentLayout: Int
        get() = R.layout.fragment_home

    val test : InjectionTest by inject<InjectionTest>()

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity.toast(test.getMessage())
    }
}

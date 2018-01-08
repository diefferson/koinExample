package br.com.disapps.simplemvvm.ui.common

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by diefferson on 29/11/2017.
 */
abstract class BaseFragment : Fragment() {

    abstract val fragmentTag: String
    abstract val fragmentName: String
    abstract val fragmentLayout: Int

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater!!.inflate(fragmentLayout, container, false)

}
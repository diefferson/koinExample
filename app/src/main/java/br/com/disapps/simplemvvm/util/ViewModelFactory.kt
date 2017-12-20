package br.com.disapps.simplemvvm.util

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

/**
 * Created by diefferson on 20/12/2017.
 */
class ViewModelFactory constructor(
        private val creators: Map<Class<out ViewModel>,ViewModel>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        var creator: ViewModel? = creators[modelClass]
        if (creator == null) {
            for ((key, value) in creators) {
                if (modelClass.isAssignableFrom(key)) {
                    creator = value
                    break
                }
            }
        }
        if (creator == null) {
            throw IllegalArgumentException("unknown model class " + modelClass)
        }
        try {
            return creator as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}
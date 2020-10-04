package com.enesky.daggerplayground.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

/**
 * Created by Enes Kamil YILMAZ on 02/10/2020
 * referenced from : https://github.com/googlesamples/android-architecture-components
 */

class ViewModelProviderFactory
    @Inject
    constructor(
        private val viewModelMap: Map<Class<out ViewModel>,
                @JvmSuppressWildcards Provider<ViewModel>>
    ) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        var viewModel = viewModelMap[modelClass]

        if (viewModel == null) { // if the viewmodel has not been created
            // loop through the allowable keys (aka allowed classes with the @ViewModelKey)
            for ((key, value) in viewModelMap) {
                // if it's allowed, set the Provider<ViewModel>
                if (modelClass.isAssignableFrom(key)) {
                    viewModel = value
                    break
                }
            }
        }

        // if this is not one of the allowed keys, throw exception
        requireNotNull(viewModel) { "unknown model class $modelClass" }

        // return the Provider
        return try { viewModel.get() as T }
               catch (e: Exception) { throw RuntimeException(e) }
    }

}
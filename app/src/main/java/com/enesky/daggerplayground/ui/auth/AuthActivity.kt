package com.enesky.daggerplayground.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.enesky.daggerplayground.R
import com.enesky.daggerplayground.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject lateinit var vmProviderFactory: ViewModelProviderFactory
    @Inject lateinit var logo: Drawable
    @Inject lateinit var requestManager: RequestManager

    private lateinit var viewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        viewModel = ViewModelProvider(this, vmProviderFactory).get(AuthViewModel::class.java)

        setLogo()
    }

    private fun setLogo() {
        requestManager.load(logo).into(iv_icon)
    }

    companion object {
        private const val TAG = "AuthActivity"
    }

}
package com.enesky.daggerplayground.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.enesky.daggerplayground.R
import com.enesky.daggerplayground.databinding.ActivityAuthBinding
import com.enesky.daggerplayground.util.TAG
import com.enesky.daggerplayground.util.observeNonNull
import com.enesky.daggerplayground.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject lateinit var vmProviderFactory: ViewModelProviderFactory
    @Inject lateinit var logo: Drawable
    @Inject lateinit var requestManager: RequestManager

    private lateinit var viewModel: AuthViewModel
    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(AuthViewModel::class.java)

        setLogo()

        binding.btnLogin.setOnClickListener { 
            login()
        }

        viewModel._user.observeNonNull(this) { user ->
            Log.d(TAG(), "User login attemp is successful. -> ${user.name}")
        }

    }

    private fun login() {
        val userId = binding.etUserId.text
        if (!userId.isNullOrEmpty())
            viewModel.getUserInfo(userId.toString().toInt())
    }

    private fun setLogo() {
        requestManager.load(logo).into(iv_icon)
    }

}
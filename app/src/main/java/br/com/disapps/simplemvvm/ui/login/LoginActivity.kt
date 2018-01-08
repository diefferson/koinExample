package br.com.disapps.simplemvvm.ui.login

import android.os.Bundle
import br.com.disapps.simplemvvm.R
import br.com.disapps.simplemvvm.ui.common.BaseActivity
import org.koin.android.architecture.ext.getViewModel

class LoginActivity : BaseActivity() {



    override val activityTag: String
        get() = LoginActivity::class.java.simpleName

    override val activityName: String
        get() = getString(R.string.login)

    override val activityLayout: Int
        get() = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = getViewModel<LoginViewModel>()

    }
}
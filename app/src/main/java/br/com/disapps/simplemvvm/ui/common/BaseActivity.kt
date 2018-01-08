package br.com.disapps.simplemvvm.ui.common

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


/**
 * Created by diefferson on 29/11/2017.
 */
abstract class BaseActivity : AppCompatActivity() {

    abstract val activityTag: String
    abstract val activityName: String
    abstract val activityLayout: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityLayout)
    }
}
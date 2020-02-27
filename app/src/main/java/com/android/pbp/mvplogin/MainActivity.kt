package com.android.pbp.mvplogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.android.pbp.mvplogin.di.ActivityModule
import com.android.pbp.mvplogin.di.DaggerActivityComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(),LoginContract.LoginView{

    @Inject lateinit var presenter : LoginContract.LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerActivityComponent.builder().activityModule(ActivityModule(this)).build().inject(this)
        presenter.onAttach(this)
        presenter.onSubscribe()
        presenter.onLoginClick()
    }


    override fun showLoader(show :Boolean) {
        if(show)
             progressBar.visibility = View.VISIBLE
        else
            progressBar.visibility = View.GONE

    }

    override fun loginSuccessful() {
        login.setText("Login Done")
    }

    override fun loginFailure() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unsubscribe()
    }
}

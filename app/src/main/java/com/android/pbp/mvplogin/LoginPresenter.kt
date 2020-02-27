package com.android.pbp.mvplogin

class LoginPresenter : LoginContract.LoginPresenter{
    override fun onLoginClick() {
        view.showLoader(true)
        isLogin()
    }

    override fun onSubscribe() {
    }

    override fun unsubscribe() {
    }

    lateinit var view :LoginContract.LoginView
    override fun isLogin() {
        view.showLoader(false)
        view.loginSuccessful()
    }

    override fun onAttach(view : LoginContract.LoginView) {
        this.view = view
    }

}
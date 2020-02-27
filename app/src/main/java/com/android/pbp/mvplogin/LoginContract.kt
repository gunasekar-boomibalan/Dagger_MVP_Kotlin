package com.android.pbp.mvplogin

class LoginContract {
    interface LoginView : BaseContract.View{
        fun showLoader(show : Boolean)
        fun loginSuccessful()
        fun loginFailure()
    }

    interface LoginPresenter : BaseContract.Presenter<LoginView>{
        fun isLogin()
        fun onLoginClick()
    }
}
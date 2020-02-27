package com.android.pbp.mvplogin.di

import com.android.pbp.mvplogin.LoginContract
import com.android.pbp.mvplogin.LoginPresenter
import com.android.pbp.mvplogin.MainActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule (var activity : MainActivity){
    @Provides
    fun providesMainActivity(): MainActivity {
        return activity;
    }
    @Provides
    fun providesLoginPresenter() : LoginContract.LoginPresenter{
        return LoginPresenter()
    }
}
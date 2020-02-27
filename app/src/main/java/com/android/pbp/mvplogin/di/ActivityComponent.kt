package com.android.pbp.mvplogin.di

import com.android.pbp.mvplogin.MainActivity
import dagger.Component
import dagger.Module
import javax.inject.Inject

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
 fun inject(mainActivity: MainActivity)
}
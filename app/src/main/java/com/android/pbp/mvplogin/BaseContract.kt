package com.android.pbp.mvplogin

class BaseContract{
    interface View {}
    interface Presenter<in T>{
        fun onSubscribe()
        fun onAttach(view :T)
        fun unsubscribe()
    }
}
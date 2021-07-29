package com.evgeniykim.mvpmoxydagger

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.evgeniykim.mvpmoxydagger.mvp.MainView

@InjectViewState
class MainPresenter(private val data: String) : MvpPresenter<MainView>() {

    fun doIt() {
        viewState.test()
    }
}
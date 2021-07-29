package com.evgeniykim.mvpmoxydagger.di

import com.evgeniykim.mvpmoxydagger.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @ActivityScope
    @Provides
    fun provideSmth(): String {
        return "Smth"
    }

    @ActivityScope
    @Provides
    fun providePresenter(): MainPresenter {
        return MainPresenter("SmthOK")
    }
}
package com.evgeniykim.mvpmoxydagger.di

import android.app.Application
import com.evgeniykim.mvpmoxydagger.MyApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilder::class])
interface AppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MyApp)
}
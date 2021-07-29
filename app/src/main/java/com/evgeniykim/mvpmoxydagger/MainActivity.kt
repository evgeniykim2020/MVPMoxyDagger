package com.evgeniykim.mvpmoxydagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.arellomobile.mvp.presenter.InjectPresenter
import com.evgeniykim.mvpmoxydagger.mvp.BaseActivity
import com.evgeniykim.mvpmoxydagger.mvp.MainView
import javax.inject.Inject

class MainActivity : BaseActivity<MainView, MainPresenter>(), MainView {

    lateinit var btnTest: Button

    override fun test() {
        Toast.makeText(this, "DONE", Toast.LENGTH_SHORT).show()
    }

    @InjectPresenter
    @Inject
    override lateinit var presenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTest.findViewById<Button>(R.id.btnTest)
        btnTest.setOnClickListener{ presenter.doIt() }
    }


}
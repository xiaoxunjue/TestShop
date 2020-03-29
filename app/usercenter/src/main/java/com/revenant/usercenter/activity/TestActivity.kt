package com.revenant.usercenter.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.revenant.usercenter.R
import org.jetbrains.anko.toast

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        toast("${intent.getIntExtra("id",-1)}");
    }
}

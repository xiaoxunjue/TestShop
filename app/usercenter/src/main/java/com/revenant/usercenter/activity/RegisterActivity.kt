package com.revenant.usercenter.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.ToastUtils
import com.revenant.baselibrary.ui.activity.BaseMvpActivity
import com.revenant.usercenter.R
import com.revenant.usercenter.presenter.RegisterPresenter
import com.revenant.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast
import org.jetbrains.anko.startActivity


class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter()
        mPresenter.mView=this;
        register.setOnClickListener{
//startActivity(intentFor<TestActivity>("id" to 5))
//startActivity<TestActivity>("id" to 5)
//            toast("注册")
            mPresenter.register("","")
        }

    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功1212122121212132")
    }
}

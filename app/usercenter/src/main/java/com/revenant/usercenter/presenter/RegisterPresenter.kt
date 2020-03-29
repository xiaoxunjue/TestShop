package com.revenant.usercenter.presenter

import com.kotlin.base.presenter.BasePresenter
import com.revenant.usercenter.presenter.view.RegisterView

 class RegisterPresenter:
     BasePresenter<RegisterView>() {
     fun register(mobile:String,verify:String){
         /*业务逻辑*/
         mView.onRegisterResult(true)
     }

}
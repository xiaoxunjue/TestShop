package com.kotlin.base.presenter

import android.content.Context
import com.kotlin.base.presenter.view.BaseView


/*
    MVP中P层 基类
 */
open class BasePresenter<T:BaseView>{

    lateinit var mView:T

}

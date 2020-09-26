package com.imyyq.modularization.module2_lib

import android.app.Application
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.alibaba.android.arouter.launcher.ARouter
import com.imyyq.modularization.arouter.ARouterPath
import com.imyyq.mvvm.base.BaseModel
import com.imyyq.mvvm.base.BaseViewModel

class Module2LibViewModel(app: Application) : BaseViewModel<BaseModel>(app) {
    val test = MutableLiveData<String>("我是从 Module2 来的，点击我通过 arouter 跳转到 Module1")

    val startToModule1 = View.OnClickListener {
        ARouter.getInstance().build(ARouterPath.module1).navigation();
    }
}
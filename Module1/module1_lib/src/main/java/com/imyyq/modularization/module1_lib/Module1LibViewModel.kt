package com.imyyq.modularization.module1_lib

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.imyyq.mvvm.base.BaseModel
import com.imyyq.mvvm.base.BaseViewModel

class Module1LibViewModel(app: Application) : BaseViewModel<BaseModel>(app) {
    val test = MutableLiveData<String>("我是从 Module1 来的")
}
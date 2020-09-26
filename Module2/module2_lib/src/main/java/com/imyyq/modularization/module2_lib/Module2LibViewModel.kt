package com.imyyq.modularization.module2_lib

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.imyyq.mvvm.base.BaseModel
import com.imyyq.mvvm.base.BaseViewModel

class Module2LibViewModel(app: Application) : BaseViewModel<BaseModel>(app) {
    val test = MutableLiveData<String>("我是从 Module2 来的")
}
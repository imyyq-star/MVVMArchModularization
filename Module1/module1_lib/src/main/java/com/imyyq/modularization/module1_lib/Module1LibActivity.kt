package com.imyyq.modularization.module1_lib

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.alibaba.android.arouter.facade.annotation.Route
import com.imyyq.modularization.arouter.ARouterPath
import com.imyyq.modularization.module1_lib.databinding.Module1LibActivityModule1LibBinding
import com.imyyq.mvvm.base.NoViewModelBaseActivity
import com.imyyq.mvvm.base.ViewBindingBaseActivity

@Route(path = ARouterPath.module1)
class Module1LibActivity : NoViewModelBaseActivity<Module1LibActivityModule1LibBinding>() {
    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?) =
        Module1LibActivityModule1LibBinding.inflate(inflater)
}
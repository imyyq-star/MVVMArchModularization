package com.imyyq.modularization.module2_lib

import android.view.LayoutInflater
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.imyyq.modularization.arouter.ARouterPath
import com.imyyq.modularization.module2_lib.databinding.Module2LibActivityModule2LibBinding
import com.imyyq.mvvm.base.NoViewModelBaseActivity

@Route(path = ARouterPath.module2)
class Module2LibActivity : NoViewModelBaseActivity<Module2LibActivityModule2LibBinding>() {
    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?) =
        Module2LibActivityModule2LibBinding.inflate(inflater)
}
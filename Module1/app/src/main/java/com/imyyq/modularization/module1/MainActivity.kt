package com.imyyq.modularization.module1

import com.imyyq.modularization.module1.databinding.ActivityMainBinding
import com.imyyq.mvvm.base.DataBindingBaseActivity

class MainActivity : DataBindingBaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main, BR.viewModel
) {
}
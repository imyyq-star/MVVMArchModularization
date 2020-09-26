package com.imyyq.modularization.module2

import com.imyyq.modularization.module2.databinding.ActivityMainBinding
import com.imyyq.mvvm.base.DataBindingBaseActivity

class MainActivity : DataBindingBaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main, BR.viewModel
) {
}
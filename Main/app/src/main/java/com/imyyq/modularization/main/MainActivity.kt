package com.imyyq.modularization.main

import com.imyyq.modularization.main.databinding.ActivityMainBinding
import com.imyyq.mvvm.base.DataBindingBaseActivity

class MainActivity : DataBindingBaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main, BR.viewModel
) {
}
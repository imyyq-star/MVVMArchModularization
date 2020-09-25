package com.imyyq.modularization.module1_lib

import com.imyyq.modularization.module1_lib.databinding.FragmentModule1LibBinding
import com.imyyq.mvvm.base.DataBindingBaseFragment

class Module1LibFragment : DataBindingBaseFragment<FragmentModule1LibBinding, Module1LibViewModel>(
    R.layout.fragment_module1_lib, BR.viewModel
) {
}
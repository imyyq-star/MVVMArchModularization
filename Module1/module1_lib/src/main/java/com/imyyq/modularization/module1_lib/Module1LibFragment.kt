package com.imyyq.modularization.module1_lib

import com.imyyq.modularization.module1_lib.databinding.Module1LibFragmentModule1LibBinding
import com.imyyq.mvvm.base.DataBindingBaseFragment

class Module1LibFragment : DataBindingBaseFragment<Module1LibFragmentModule1LibBinding, Module1LibViewModel>(
    R.layout.module1_lib_fragment_module1_lib, BR.viewModel
) {
}
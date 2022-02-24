package com.wsayan.ballet.ui.main

import com.wsayan.ballet.repo.MoviesRepository
import com.wsayan.ballet.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    var moviesRepo: MoviesRepository
) : BaseViewModel() {
}
package com.wsayan.ballet.ui.splash

import androidx.lifecycle.viewModelScope
import com.wsayan.ballet.network.NetworkState
import com.wsayan.ballet.network.data.Images
import com.wsayan.ballet.network.resolveError
import com.wsayan.ballet.repo.MoviesRepository
import com.wsayan.ballet.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    var moviesRepo: MoviesRepository
) : BaseViewModel() {
    fun getConfigurations() = flow {
        emit(NetworkState.Loading)

        try {
            emit(NetworkState.Data(moviesRepo.fetchConfigurations()))
        } catch (e: Exception) {
            emit(e.resolveError())
        }
    }

    fun saveConfigurations(images: Images) {
        viewModelScope.launch {
            moviesRepo.insertImageConfig(images)
        }
    }

    fun saveImageBaseUrl(url: String) = moviesRepo.cacheImageBaseUrl(url)

    val isLocalConfigExists = moviesRepo.isEmptyImageConfig()
}
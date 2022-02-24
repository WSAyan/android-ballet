package com.wsayan.ballet.di

import android.content.Context
import com.wsayan.ballet.db.RoomHelper
import com.wsayan.ballet.network.IApiService
import com.wsayan.ballet.preference.PreferencesHelper
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class DataManager @Inject constructor(
    val preferencesHelper: PreferencesHelper,
    val roomHelper: RoomHelper,
    val apiService: IApiService,
    @ApplicationContext context: Context
)
package com.wsayan.ballet.ui.common

import android.view.View
import android.view.ViewGroup
import com.wsayan.ballet.ui.base.BaseViewHolder

interface IAdapterListener {
    fun <T> clickListener(position: Int, model: T, view: View)
    fun  getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder
}
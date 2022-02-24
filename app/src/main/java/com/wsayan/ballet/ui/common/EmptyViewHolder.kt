package com.wsayan.ballet.ui.common

import android.content.Context
import androidx.databinding.ViewDataBinding
import com.wsayan.ballet.databinding.ItemEmptyBinding
import com.wsayan.ballet.ui.base.BaseViewHolder

class EmptyViewHolder (itemView: ViewDataBinding, context: Context) :
    BaseViewHolder(itemView.root) {
    var binding = itemView as ItemEmptyBinding

    override fun <T> onBind(position: Int, itemModel: T, listener: IAdapterListener) {

    }
}
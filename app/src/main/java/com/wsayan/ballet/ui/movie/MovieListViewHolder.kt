package com.wsayan.ballet.ui.movie

import android.content.Context
import androidx.viewbinding.ViewBinding
import com.wsayan.ballet.network.data.ResultsItem
import com.wsayan.ballet.databinding.ItemMovieBinding
import com.wsayan.ballet.ui.base.BaseViewHolder
import com.wsayan.ballet.ui.common.IAdapterListener

class MovieListViewHolder(
    itemView: ViewBinding,
    context: Context
) : BaseViewHolder(itemView.root) {

    var binding = itemView as ItemMovieBinding
    var mContext: Context = context

    override fun <T> onBind(position: Int, itemModel: T, listener: IAdapterListener) {
        itemModel as ResultsItem

        binding.nameTV.text = itemModel.title
        binding.dateTV.text = itemModel.releaseDate

        binding.itemLayout.setOnClickListener {
            listener.clickListener(position, itemModel, binding.itemLayout)
        }
    }
}
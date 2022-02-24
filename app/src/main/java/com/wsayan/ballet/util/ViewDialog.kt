package com.wsayan.ballet.util

import android.app.Dialog
import android.content.Context
import android.view.Window
import com.wsayan.ballet.R

class ViewDialog(context: Context) : Dialog(context) {
    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        //setIndeterminate(true);
        //setMessage(context.getResources().getString(R.string.please_wait));
        setContentView(R.layout.loading_layout)
        setCancelable(false)
    }
}
package com.myappcompany.doglistapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object DataBindingAdapters {

    @BindingAdapter("android:src")
    fun setImageResoruce(imageView: ImageView, resource: Int) {
        imageView.setImageResource(resource)
    }
}

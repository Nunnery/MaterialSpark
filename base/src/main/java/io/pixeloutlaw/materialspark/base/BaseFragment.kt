package io.pixeloutlaw.materialspark.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

open class BaseFragment(@LayoutRes private val layoutId: Int? = null) : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return if (layoutId != null) {
            inflater.inflate(layoutId, container)
        } else {
            super.onCreateView(inflater, container, savedInstanceState)
        }
    }
}
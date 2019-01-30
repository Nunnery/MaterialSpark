package io.pixeloutlaw.materialspark.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity(@LayoutRes private val layoutId: Int? = null): AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (layoutId != null) {
            setContentView(layoutId)
        }
    }
}
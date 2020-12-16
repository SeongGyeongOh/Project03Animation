package com.osg.project03animation

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onAnimation()
    }

    private fun onAnimation() {
        val firstAnim = we.drawable
        val animation = firstAnim as AnimatedVectorDrawable
        animation.start()

        val secondAnim = lin.drawable
        val animation2 = secondAnim as AnimatedVectorDrawable
        animation2.start()
    }
}
package by.tms.myandroid

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dz2_animation.*

lateinit var animCat: AnimationDrawable

class Dz2Activity_Animation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz2_animation)
        animImg.apply {
            setBackgroundResource(R.drawable.animation_cat)
            animCat = background as AnimationDrawable
        }
    }
    override fun onStart() {
        super.onStart()
        animCat.start()
    }
}
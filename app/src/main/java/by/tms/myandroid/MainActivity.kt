package by.tms.myandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHW1 = button
        buttonHW1.setOnClickListener{ сlick(buttonHW1)}
    }

    fun сlick(view: View) {
        val intent = Intent(this, Dz1Activity::class.java)
        startActivity(intent)
    }

}

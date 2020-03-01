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
        buttonHW1.setOnClickListener{
            startActivity(Intent(this,Dz1Activity::class.java))}

            val buttonHW2 = button2
        buttonHW2.setOnClickListener{
        startActivity(Intent(this,Dz2Activity::class.java))}

        val buttonHW3 = button3
        buttonHW3.setOnClickListener {
            startActivity(Intent(this, Dz2Activity_Animation::class.java)) }
}
}

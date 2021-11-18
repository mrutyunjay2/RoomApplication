package mtj.roomdatabaseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val  floating_button_add:FloatingActionButton = findViewById(R.id.floating_button_add)
       floating_button_add.setOnClickListener {
            //nothing to do
       }
    }


}
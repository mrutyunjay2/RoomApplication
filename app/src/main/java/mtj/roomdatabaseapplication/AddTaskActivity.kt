package mtj.roomdatabaseapplication

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import mtj.roomdatabaseapplication.db.AppDatabase
import mtj.roomdatabaseapplication.db.Task

class AddTaskActivity : AppCompatActivity() {

    lateinit var editTextTask: EditText
    lateinit var editTextDesc: EditText
    lateinit var editTextFinishBy: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
        editTextTask = findViewById(R.id.editTextTask);
        editTextDesc = findViewById(R.id.editTextDesc);
        editTextFinishBy = findViewById(R.id.editTextFinishBy);

    }

    fun save(view: View) {

    }


}
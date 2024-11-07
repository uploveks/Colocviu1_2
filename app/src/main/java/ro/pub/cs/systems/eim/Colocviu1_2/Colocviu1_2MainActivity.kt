package ro.pub.cs.systems.eim.Colocviu1_2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Colocviu1_2MainActivity : AppCompatActivity() {
    private lateinit var inputNumber: EditText
    private lateinit var allTerms: EditText

    private var numbers = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_2_main)

        inputNumber = findViewById(R.id.next_term)
        allTerms = findViewById(R.id.sum)

        val add_button = findViewById<Button>(R.id.add_button)
        add_button.setOnClickListener {
            if (inputNumber.text.toString().isNotEmpty()) {
                allTerms.append(inputNumber.text.toString() + "+")
                numbers.add(inputNumber.text.toString().toInt())
                inputNumber.setText("")
            } else {
                Log.d("Concatenare", "Concatenarea este ignorata, camp null")
            }
        }

    }
}
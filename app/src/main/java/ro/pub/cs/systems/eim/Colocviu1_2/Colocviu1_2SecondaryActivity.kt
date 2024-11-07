package ro.pub.cs.systems.eim.Colocviu1_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Colocviu1_2SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val addTerms = intent.getStringExtra("addTerms")

        var sum = 0
        if (addTerms.isNullOrEmpty()) {
            setResult(RESULT_CANCELED)
            finish()
            return
        } else {
            val addTermsList = addTerms.split("+")
            sum = addTermsList.sumOf { it.toInt() }
        }

        setResult(RESULT_OK, Intent().apply {
            putExtra("sum", sum)
        })

        finish()


    }
}
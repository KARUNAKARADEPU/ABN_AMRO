package com.abnamro.apps.referenceandroid

import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random.Default.nextInt
import kotlin.random.Random as KotlinRandomRandom

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "You have 0 unread messages", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val balButton = findViewById<Button>(R.id.balButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
//        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        balButton.setOnClickListener{
//            val rand = Random().nextInt()
            val rand = (1000..10000).random()
            val currencySymbol = "€"
            val savingbalance =rand.toString()
                val totalbalance = currencySymbol+savingbalance
                        resultsTextView.text= totalbalance
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(applicationContext, "click on setting", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_share -> {
                Toast.makeText(applicationContext, "click on share", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_exit -> {
                Toast.makeText(applicationContext, "click on exit", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

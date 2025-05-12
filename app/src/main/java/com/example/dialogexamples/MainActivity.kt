package com.example.dialogexamples

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.button_show).setOnClickListener {
//            val dialog = AlertDialog.Builder(this)
//                .setTitle("Quit app?")
//                .setMessage("Dialog message")
//                .setPositiveButton("Yes") { dialog, which -> Log.v("TAG", "YES was clicked") }
//                .setNegativeButton("No") { dialog, which -> Log.v("TAG", "NO was clicked") }
//                .setNeutralButton("Cancel", null)
//                .create()
//            dialog.setCanceledOnTouchOutside(false)
//            dialog.show()

            val items = mutableListOf<String>()
            repeat(50) { items.add("Item $it")  }

//            AlertDialog.Builder(this)
//                .setTitle("Select an item")
//                .setItems(R.array.test_array, { _, which -> Log.v("TAG", "$which - ${items[which]}") })
//                .create()
//                .show()

//            AlertDialog.Builder(this)
//                .setTitle("Select an item")
//                .setSingleChoiceItems(items.toTypedArray(), 0) { _, which ->
//                    Log.v("TAG", "$which - ${items[which]}")
//                }
//                .setPositiveButton("OK") { _, _ -> }
//                .setNegativeButton("Cancel", null)
//                .create()
//                .show()

            val checked = BooleanArray(items.size)
            AlertDialog.Builder(this)
                .setTitle("Select items")
                .setMultiChoiceItems(items.toTypedArray(), checked) { _, which, isChecked ->
                    Log.v("TAG", "$which - ${items[which]} - $isChecked")
                }
                .setPositiveButton("OK") { _, _ -> }
                .setNegativeButton("Cancel", null)
                .create()
                .show()

        }
    }
}
package com.example.dialogexamples

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import java.util.Calendar

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

//            val checked = BooleanArray(items.size)
//            AlertDialog.Builder(this)
//                .setTitle("Select items")
//                .setMultiChoiceItems(items.toTypedArray(), checked) { _, which, isChecked ->
//                    Log.v("TAG", "$which - ${items[which]} - $isChecked")
//                }
//                .setPositiveButton("OK") { _, _ -> }
//                .setNegativeButton("Cancel", null)
//                .create()
//                .show()


//            val dialogView = layoutInflater.inflate(R.layout.layout_dialog, null)
//            val editEmail = dialogView.findViewById<EditText>(R.id.edit_email)
//            val editPassword = dialogView.findViewById<EditText>(R.id.edit_password)
//
//            val dialog = AlertDialog.Builder(this)
//                .setView(dialogView)
//                .create()
//
//            dialogView.findViewById<Button>(R.id.button_ok).setOnClickListener {
//                dialog.dismiss()
//            }
//            dialogView.findViewById<Button>(R.id.button_cancel).setOnClickListener {
//                dialog.dismiss()
//            }
//
//            dialog.show()

//            val c = Calendar.getInstance()
//            val mday = c.get(Calendar.DAY_OF_MONTH)
//            val mmonth = c.get(Calendar.MONTH)
//            val myear = c.get(Calendar.YEAR)
//            DatePickerDialog(this, {_, year, month, day -> Log.v("TAG", "$year - $month - $day")},
//                myear, mmonth, mday).show()

            // Get current time
//            val c = Calendar.getInstance()
//            val mHour = c.get(Calendar.HOUR)
//            val mMinute = c.get(Calendar.MINUTE)
//            TimePickerDialog(this, { _, hourOfDay, minute ->
//                Log.v("TAG", "$hourOfDay:$minute")
//            }, mHour, mMinute, true).show()

            //Toast.makeText(this@MainActivity, "Hello World", Toast.LENGTH_LONG).show()

            Snackbar.make(it, "Hello World", Snackbar.LENGTH_LONG)
                .setAction("UNDO") {  }
                .show()
        }
    }
}
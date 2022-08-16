package com.example.training

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val spinner1: Spinner = findViewById(R.id.spinner1)
//
//        var strArray = arrayOf(
//            "C-Programming", "Data Structure", "Database", "Python",
//            "Java", "Operating System", "Compiler Design", "Android Development"
//        )
//        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, strArray)
//        spinner1.adapter = adapter1


        var emp = arrayListOf(
            Employee(
                "shimaa",
                "trainee",
                "https://cdn.xxl.thumbs.canstockphoto.com/happy-employee-portrait-of-successful-businesswoman-looking-at-camera-with-smile-picture_csp7091881.jpg"
            ),
            Employee(
                "sara",
                "senior android",
                "https://cdn.xxl.thumbs.canstockphoto.com/happy-employee-portrait-of-successful-businesswoman-looking-at-camera-with-smile-picture_csp7091881.jpg"
            ),
            Employee(
                "Yahia",
                "web developer",
                "https://cdn.xxl.thumbs.canstockphoto.com/happy-employee-portrait-of-successful-businesswoman-looking-at-camera-with-smile-picture_csp7091881.jpg"
            )
        )

        val employeeAdapter = EmployeeAdapter(this, emp)

        findViewById<ListView>(R.id.rvEmployee).adapter = employeeAdapter

    }
}
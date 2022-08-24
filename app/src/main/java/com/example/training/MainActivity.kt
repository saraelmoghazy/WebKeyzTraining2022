package com.example.training

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.training.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // use view binding in activity
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        //recylcerview
//        val employeeAdapter = EmployeeAdapter(this, emp)
//        binding.rvEmployee.layoutManager = LinearLayoutManager(this)
//        binding.rvEmployee.adapter = employeeAdapter


        val quotesApi = RetrofitBuilder.getInstance().create(QoutesAPIs::class.java)

        GlobalScope.launch {
            val result = quotesApi.getQuotes()
            Log.i("result", result.body().toString())
        }
    }
}
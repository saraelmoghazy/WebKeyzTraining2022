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
                "https://cdn.shrm.org/image/upload/c_crop%2Ch_3888%2Cw_6917%2Cx_0%2Cy_253/c_fit%2Cf_auto%2Cq_auto%2Cw_767/v1/Employee%20Relations/bored_worker_photo_k9vufj?databtoa=eyIxNng5Ijp7IngiOjAsInkiOjI1MywieDIiOjY5MTcsInkyIjo0MTQxLCJ3Ijo2OTE3LCJoIjozODg4fSwiMXgxIjp7IngiOjEzMDQsInkiOjAsIngyIjo1NjY2LCJ5MiI6NDM1NywidyI6NDM2MywiaCI6NDM1N319"
            ),
            Employee(
                "sara",
                "senior android",
                "https://media.istockphoto.com/photos/portrait-of-cheerful-businesswoman-smiling-at-the-meeting-picture-id1218610083?k=20&m=1218610083&s=612x612&w=0&h=OwaDQ2DQu_7E9cz0n1rdXUFPckoKNpWsJU92pPPiRok="
            ),
            Employee(
                "Yahia",
                "web developer",
                "https://images.pexels.com/photos/927022/pexels-photo-927022.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
            )
        )

        val employeeAdapter = EmployeeAdapter(this, emp)

        findViewById<ListView>(R.id.rvEmployee).adapter = employeeAdapter

    }
}
package com.example.demo_recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById(R.id.activity_main_recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val employees = ArrayList<Employee>()
        employees.add(Employee("1","Naimish","Intern"))
        employees.add(Employee("2","Manju","Intern"))
        employees.add(Employee("3","Priyasha","Intern"))
        employees.add(Employee("4","Harsh","Intern"))
        employees.add(Employee("5","Sandeep K","Intern"))
        employees.add(Employee("6","Kajol","Intern"))
        employees.add(Employee("7","Punit","Intern"))
        employees.add(Employee("8","Laddu","Intern"))

    }
}
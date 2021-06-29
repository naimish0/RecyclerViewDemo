package com.example.demo_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdaptor( val employeeList:ArrayList<Employee>) : RecyclerView.Adapter<CustomAdaptor.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdaptor.ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomAdaptor.ViewHolder, position: Int) {
        holder.bindItems(employeeList[position])
    }

    override fun getItemCount(): Int {
        return employeeList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindItems(employee: Employee){
            val textViewId = itemView.findViewById(R.id.list_empId_textView) as TextView
            val textViewName = itemView.findViewById(R.id.list_empName_textView) as TextView
            val textViewDesignation = itemView.findViewById(R.id.list_empDesignation_textView) as TextView
            textViewId.text = employee.id
            textViewName.text = employee.name
            textViewDesignation.text = employee.designation
        }
    }
}
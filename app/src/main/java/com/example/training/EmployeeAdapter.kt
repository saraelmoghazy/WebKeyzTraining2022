package com.example.training

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class EmployeeAdapter(
    context: Context, var items:
    List<Employee>
) : RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {


    class EmployeeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txtName: TextView
        var txtTitle: TextView
        var icEmployee: ImageView

        init {
            txtName = view.findViewById(R.id.txtName)
            txtTitle = view.findViewById(R.id.txtTitle)
            icEmployee = view.findViewById(R.id.icEmployee)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.employee_item_layout, parent, false)

        return EmployeeViewHolder(view)

    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        holder.txtName.text = items[position].name
        holder.txtTitle.text = items[position].title
        Picasso.get().load(items[position].img).into(holder.icEmployee)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
package com.example.training

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class EmployeeAdapter(
    context: Context, var items:
    List<Employee>
) : ArrayAdapter<Employee>(context, 0, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = inflater.inflate(R.layout.employee_item_layout, parent, false)

        rowView.findViewById<TextView>(R.id.txtName).text = items[position].name
        rowView.findViewById<TextView>(R.id.txtTitle).text = items[position].title

        Picasso.get().load(items[position].img)
            .into(rowView.findViewById<ImageView>(R.id.icEmployee))


        return rowView

    }
}
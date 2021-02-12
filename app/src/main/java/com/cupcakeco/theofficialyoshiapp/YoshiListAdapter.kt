package com.cupcakeco.theofficialyoshiapp

import android.app.Activity
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

// https://www.javatpoint.com/kotlin-android-custom-listview
// https://www.tutorialspoint.com/how-to-write-a-custom-adapter-for-my-list-view-on-android-using-kotlin
// CustomArrayAdapterFun

class YoshiListAdapter(
    private val context: Activity,
    private val names: ArrayList<String>,
    private val imgIDs: ArrayList<Int>
    ): ArrayAdapter<String>(context, R.layout.yoshi_list, names) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.yoshi_list, null, true)

        val nameTextView = rowView.findViewById(R.id.name) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView

        Log.d("TEMP", R.drawable.appicon.toString())
        Log.d("TEMP", imgIDs[0].toString())

        nameTextView.text = names[position]
        imageView.setImageResource(imgIDs[position])

        return rowView
    }
}
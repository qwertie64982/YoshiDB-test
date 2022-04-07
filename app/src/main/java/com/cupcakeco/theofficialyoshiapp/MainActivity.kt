package com.cupcakeco.theofficialyoshiapp

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cupcakeco.theofficialyoshiapp.models.Yoshi
import com.cupcakeco.theofficialyoshiapp.models.YoshiRecyclerAdapter

class MainActivity : AppCompatActivity() {

    private var tempList = ArrayList<String>()
    private var tempList2 = ArrayList<Int>()
    private var tempYoshiList = ArrayList<Yoshi>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        // Test if it can scroll down
        for (i in 1..1000) {
            val tempYosh = Yoshi()
            tempYosh.name = "yoshi $i"
            tempYoshiList.add(tempYosh)

            tempList.add("yoshi $i")
            tempList2.add(R.drawable.fillericon)
        }

        // fab temp snackbar demo (yummy)
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = YoshiRecyclerAdapter(tempYoshiList)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
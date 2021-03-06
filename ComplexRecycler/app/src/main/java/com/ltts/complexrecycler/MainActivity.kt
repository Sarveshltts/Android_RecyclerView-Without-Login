package com.ltts.complexrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mrv =findViewById<RecyclerView>(R.id.myrecyclerview)
        mrv.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        var mydata=ArrayList<Data>()
        mydata.add(Data("Sarvesh","sa@gmail.com","9651753741"))
        mydata.add(Data("Ashu","ak@gmail.com","9651753742"))
        mydata.add(Data("!audu","lc@gmail.com","9651753743"))
        mydata.add(Data("JAi","js@gmail.com","9651753744"))
        mydata.add(Data("Vishal","vrj@gmail.com","9651753745"))
        mydata.add(Data("Guy","something@gmail.com","9000000001"))

        mrv.adapter=MyAdapter(mydata)
    }
}
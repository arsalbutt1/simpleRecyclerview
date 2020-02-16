package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     /*   val listnameage = listOf(

            Nameage("ALPHA",21),
            Nameage("BRAVO",22),
            Nameage("CHARLIE",23),
            Nameage("DELTA",24),
            Nameage("ECHO",25),
            Nameage("FOXTROT",26),
            Nameage("GOLF",27),
            Nameage("HOTEL",28),
            Nameage("INDIA",29),
            Nameage("JULIET",30),
            Nameage("KILO",31),
            Nameage("LIMA",32),
            Nameage("MIKE",33),
            Nameage("NOVEMBER",34),
            Nameage("OSCAR",35),
            Nameage("PAPA",36),
            Nameage("QUEBEC",37),
            Nameage("ROMEO",38),
            Nameage("SIERRA",39),
            Nameage("TANGO",40),
            Nameage("UNIFORM",41),
            Nameage("VICTOR",42),
            Nameage("WISKEY",43),
            Nameage("XRAY",44),
            Nameage("YANKEE",45),
            Nameage("ZULU",46)

        ) */
        val listnameage = ArrayList<Nameage>()
        listnameage.add(Nameage("ALPHA",21))
        listnameage.add(Nameage("BRAVO",22))
        listnameage.add(Nameage("CHARLIE",23))
        listnameage.add(Nameage("DELTA",24))
        listnameage.add(Nameage("ECHO",25))
        listnameage.add(Nameage("FOXTROT",26))
        listnameage.add(Nameage("GOLF",27))
        listnameage.add(Nameage("HOTEL",28))
        listnameage.add(Nameage("INDIA",29))
        listnameage.add(Nameage("JULIET",30))
        listnameage.add(Nameage("KILO",31))
        listnameage.add(Nameage("LIMA",32))
        listnameage.add(Nameage("MIKE",33))
        listnameage.add(Nameage("NOVEMBER",34))
        listnameage.add(Nameage("OSCAR",35))
        listnameage.add(Nameage("PAPA",36))
        listnameage.add(Nameage("QUEBEC",37))
        listnameage.add(Nameage("ROMEO",38))
        listnameage.add(Nameage("SIERRA",39))
        listnameage.add(Nameage("TANGO",40))
        listnameage.add(Nameage("UNIFORM",41))
        listnameage.add(Nameage("VICTOR",42))
        listnameage.add(Nameage("WISKEY",43))
        listnameage.add(Nameage("XRAY",44))
        listnameage.add(Nameage("YANKEE",45))
        listnameage.add(Nameage("ZULU",46))

        //Layout Manager is responsible of aligning single items from the Arraylist.
        textRecycle.layoutManager = LinearLayoutManager(this)
        /* Adapter is a bridge between our data(Arraylist) and the recycler view. It helps
        loads only limited numbers of items that can fits on the screen. */
        textRecycle.adapter = NameageAdapter(listnameage)
        //the following piece of code helps with the performance of the App.
        textRecycle.setHasFixedSize(true)
    }
}

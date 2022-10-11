package com.example.jobsheetke14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val busana = findViewById<Button>(R.id.busana)
        val kuliner = findViewById<Button>(R.id.kuliner)
        val perangkatlunak = findViewById<Button>(R.id.perangkatlunak)
        val teknikpengelasan = findViewById<Button>(R.id.teknikpengelasan)
        val teknikotomotif = findViewById<Button>(R.id.teknikotomotif)


        busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, busana())
            fragmentTransaction.commit()
        }

        kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, kuliner())
            fragmentTransaction.commit()
        }

        perangkatlunak.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, perangkatlunak())
            fragmentTransaction.commit()
        }

        teknikpengelasan.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, teknikpengelasan())
            fragmentTransaction.commit()
        }

        teknikotomotif.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, teknikotomotif())
            fragmentTransaction.commit()
        }
        }

    }
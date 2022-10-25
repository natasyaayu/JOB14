package com.example.jobsheetke14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val busana = findViewById<Button>(R.id.btn_busana)
        val kuliner = findViewById<Button>(R.id.btn_kuliner)
        val perangkatlunak = findViewById<Button>(R.id.btn_pplg)
        val teknikotomotif = findViewById<Button>(R.id.btn_to)
        val teknikpengelasan = findViewById<Button>(R.id.btn_tpfl)


        busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, busana())
            fragmentTransaction.commit()
        }

        kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, kuliner())
            fragmentTransaction.commit()
        }

        perangkatlunak.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, perangkatlunak())
            fragmentTransaction.commit()
        }

        teknikotomotif.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, teknikotomotif())
            fragmentTransaction.commit()
        }

        teknikpengelasan.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, teknikpengelasan())
            fragmentTransaction.commit()
        }
        }

    }
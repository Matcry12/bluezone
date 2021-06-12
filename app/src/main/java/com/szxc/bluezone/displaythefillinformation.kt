package com.szxc.bluezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.szxc.bluezone.databinding.ActivityMainBinding

class displaythefillinformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_displaythefillinformation)
        val bundle: Bundle? = intent.extras
        val dulieunhan1 = bundle!!.getString("dulieu1")
        val dulieunhan2 = bundle.getString("dulieu2")
        val dulieunhan3 = bundle.getString("dulieu3")
        val dulieunhan4 = bundle.getString("dulieu4")
        val dulieunhan5 = bundle.getString("dulieu5")
        val dulieunhan6 = bundle.getString("dulieu6")
        val dulieunhan7 = bundle.getString("dulieu7")
        var lichtrinh = findViewById<TextView>(R.id.lichtrinh1)
        var hoten = findViewById<TextView>(R.id.hoten1)
        var namsinh = findViewById<TextView>(R.id.namsinh1)
        var gioitinh = findViewById<TextView>(R.id.gioitinh1)
        var quoctich = findViewById<TextView>(R.id.quoctinh1)
        var sohochieugiaythonghanh = findViewById<TextView>(R.id.sohochieu_giaythonghanh1)
        var tiepxuc = findViewById<TextView>(R.id.tiepxuc1)
        lichtrinh.text = dulieunhan1
        hoten.text = dulieunhan2
        namsinh.text = dulieunhan3
        gioitinh.text = dulieunhan4
        quoctich.text = dulieunhan5
        sohochieugiaythonghanh.text = dulieunhan6
        tiepxuc.text = dulieunhan7
        var go = findViewById<Button>(R.id.gotothesecret)
        go.setOnClickListener() {
         val intent: Intent = Intent(this, Thesecret::class.java)
            startActivity(intent)
        }

            val back = findViewById<Button>(R.id.fastback)
            back.setOnClickListener() {
                val intent: Intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()

            }

        }

    }

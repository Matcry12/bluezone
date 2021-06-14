package com.szxc.bluezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.szxc.bluezone.databinding.ActivityDisplaythefillinformationBinding
import com.szxc.bluezone.databinding.ActivityMainBinding

class displaythefillinformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityDisplaythefillinformationBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_displaythefillinformation)

        val bundle: Bundle? = intent.extras

        val dulieunhan1 = bundle!!.getString("dulieu1")

        val dulieunhan2 = bundle.getString("dulieu2")

        val dulieunhan3 = bundle.getString("dulieu3")

        val dulieunhan4 = bundle.getString("dulieu4")

        val dulieunhan5 = bundle.getString("dulieu5")

        val dulieunhan6 = bundle.getString("dulieu6")

        val dulieunhan7 = bundle.getString("dulieu7")


        binding.lichtrinh1.text = dulieunhan1

        binding.hoten1.text = dulieunhan2

        binding.namsinh1.text = dulieunhan3

        binding.gioitinh1.text = dulieunhan4

        binding.quoctich1.text = dulieunhan5

        binding.sohochieuGiaythonghanh1.text = dulieunhan6

        binding.tiepxuc1.text = dulieunhan7





                binding.gotothesecret.setOnClickListener() {
                    val intent: Intent = Intent(this, Thesecret::class.java)
                    startActivity(intent)
                }


                binding.fastback.setOnClickListener() {
                    val intent: Intent = Intent(this, Khai_bao_y_te::class.java)
                    startActivity(intent)
                    finish()

                }

            }
        }



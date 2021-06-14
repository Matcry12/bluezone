package com.szxc.bluezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MultiAutoCompleteTextView
import androidx.databinding.DataBindingUtil
import com.szxc.bluezone.databinding.ActivityMainBinding

class Khai_bao_y_te : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)


        binding.khaiBao.setOnClickListener() {
            val intent : Intent = Intent(this, displaythefillinformation::class.java)

            val dulieunhap1 = binding.khaiBaoCuaKhau.text.toString()
            intent.putExtra("dulieu1", dulieunhap1)

            val dulieunhap2 = binding.hoten.text.toString()
            intent.putExtra("dulieu2", dulieunhap2)

            val dulieunhap3 = binding.namsinh.text.toString()
            intent.putExtra("dulieu3", dulieunhap3)

            val dulieunhap4 = binding.gioitinh.text.toString()
            intent.putExtra("dulieu4", dulieunhap4)

            val dulieunhap5 = binding.quoctinh.text.toString()
            intent.putExtra("dulieu5", dulieunhap5)

            val dulieunhap6 = binding.sohochieuGiaythonghanh.text.toString()
            intent.putExtra("dulieu6", dulieunhap6)

            val dulieunhap7= binding.tiepxuc.text.toString()
            intent.putExtra("dulieu7", dulieunhap7)



            startActivity(intent)
        }

    }

}
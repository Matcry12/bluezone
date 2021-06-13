package com.szxc.bluezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MultiAutoCompleteTextView
import androidx.databinding.DataBindingUtil
import com.szxc.bluezone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        val cuakhau = binding.khaiBaoCuaKhau

        val name = binding.hoten

        val date = binding.namsinh

        val gioitinh = binding.gioitinh

        val quoctinh = binding.quoctinh

        val sohochieuGiaythonghanh = binding.sohochieuGiaythonghanh

        val tiepxuc = binding.tiepxuc

        val button = binding.khaiBao

        button.setOnClickListener() {
            val intent : Intent = Intent(this, displaythefillinformation::class.java)
            val dulieunhap1 = cuakhau.text.toString()
            intent.putExtra("dulieu1", dulieunhap1)

            val dulieunhap2 = name.text.toString()
            intent.putExtra("dulieu2", dulieunhap2)

            val dulieunhap3 = date.text.toString()
            intent.putExtra("dulieu3", dulieunhap3)

            val dulieunhap4 = gioitinh.text.toString()
            intent.putExtra("dulieu4", dulieunhap4)

            val dulieunhap5 = quoctinh.text.toString()
            intent.putExtra("dulieu5", dulieunhap5)

            val dulieunhap6 = sohochieuGiaythonghanh.text.toString()
            intent.putExtra("dulieu6", dulieunhap6)

            val dulieunhap7= tiepxuc.text.toString()
            intent.putExtra("dulieu7", dulieunhap7)



            startActivity(intent)
        }

    }

}
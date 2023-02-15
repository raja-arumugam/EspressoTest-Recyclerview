package com.example.espressotestrecylerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.espressotestrecylerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myAdapter by lazy {
        MyAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.rvData.adapter = myAdapter

        val gadgetlist = Gadgetlist("Apple14 Pro","Apple",140000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist2 = Gadgetlist("Apple13 Pro","Apple",136000.00,"Black","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist3 = Gadgetlist("Apple12 Pro","Apple",125000.00,"Green","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist4 = Gadgetlist("Apple12","Apple",80000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist5 = Gadgetlist("Apple13","Apple",950000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist6 = Gadgetlist("Apple13 Mini","Apple",85000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist7 = Gadgetlist("Apple12 Mini","Apple",73000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist8 = Gadgetlist("Apple11","Apple",70000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist9 = Gadgetlist("Apple10","Apple",64000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist10 = Gadgetlist("Apple9","Apple",55000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist11 = Gadgetlist("Pixel 2","Google",52000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist12 = Gadgetlist("Pixel 2 XL","Google",57000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist13 = Gadgetlist("Pixel 3","Google",59000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist14 = Gadgetlist("Pixel 4","Google",62000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist15 = Gadgetlist("Pixel 5","Google",70000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist16 = Gadgetlist("Pixel 6","Google",75000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist17 = Gadgetlist("Pixel 7","Google",90000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist18 = Gadgetlist("Galaxy A11","Samsung",140000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist19 = Gadgetlist("Galaxy S11","Samsung",750000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist20 = Gadgetlist("Galaxy F22","Samsung",140000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))
        val gadgetlist21 = Gadgetlist("Galaxy S12","Samsung",90000.00,"Red","164GB",resources.getResourceName(R.mipmap.ic_launcher))

        myAdapter.setData(listOf(gadgetlist,gadgetlist2,gadgetlist3,gadgetlist4,gadgetlist5,gadgetlist6,gadgetlist7,gadgetlist8,
            gadgetlist9,gadgetlist10,gadgetlist11,gadgetlist12,gadgetlist12,gadgetlist13,gadgetlist14,gadgetlist15,gadgetlist16,
            gadgetlist17,gadgetlist18,gadgetlist19,gadgetlist20,gadgetlist21))


    }

}
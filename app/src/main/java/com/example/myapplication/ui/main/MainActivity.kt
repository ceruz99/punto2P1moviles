package com.example.myapplication.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

//import com.github.skydoves.signupbinding.databinding.ActivitySignUpBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater);
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val view= mainBinding.root;
        setContentView(view)

        val guardarObserver = Observer<String>{listaF->
            mainBinding.listfTextview.text=listaF
        }
        mainViewModel.listaF.observe(this,guardarObserver)

        mainBinding.saveButton.setOnClickListener{
            mainViewModel.guardar(mainBinding.tittleEdittext.hint.toString(),mainBinding.tittleEdittext.text.toString(),mainBinding.directorEdittext.hint.toString(), mainBinding.directorEdittext.text.toString(),mainBinding.genreEdittext.hint.toString(),mainBinding.genreEdittext.text.toString(),mainBinding.scoreEdittext.hint.toString(),mainBinding.scoreEdittext.text.toString())
        }
    }
}
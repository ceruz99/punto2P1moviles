package com.example.myapplication.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

//import com.github.skydoves.signupbinding.databinding.ActivitySignUpBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater);
        val view= mainBinding.root;
        setContentView(view)
        var lista: String = ""
        mainBinding.saveButton.setOnClickListener{
            lista+="-";
            var nombre: String = mainBinding.tittleEdittext.text.toString();
            var director: String = mainBinding.directorEdittext.text.toString();
            var genero: String = mainBinding.genreEdittext.text.toString();
            var puntaje : String = mainBinding.scoreEdittext.text.toString();
            lista+=mainBinding.tittleEdittext.hint.toString()+": "+nombre+"\n"+mainBinding.directorEdittext.hint.toString()+": "+director+"\n"+mainBinding.genreEdittext.hint.toString()+": "+genero+"\n"+mainBinding.scoreEdittext.hint.toString()+": "+puntaje+"\n";
            mainBinding.listfTextview.setText(lista);
        }
    }
}
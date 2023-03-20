package com.example.myapplication.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val listaF :MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun guardar(t1:String, nombre: String, t2: String,director: String,t3:String, genero: String,t4:String, puntaje: String){
        if(nombre.isNotEmpty() and isNumeric(puntaje)){
            listaF.value+="\n"+"-"+t1+": "+nombre+"\n"+t2+": "+director+"\n"+t3+": "+genero+"\n"+t4+": "+puntaje+"\n";
        }
    }

    fun isNumeric(s: String): Boolean {
        return try {
            s.toDouble()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }
}
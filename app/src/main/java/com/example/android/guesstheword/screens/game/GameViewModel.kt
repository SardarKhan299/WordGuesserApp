package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel :ViewModel(){

    init {
        Log.d(this@GameViewModel.javaClass.simpleName, "GameViewModel: ");
    }
    override fun onCleared() {
        super.onCleared()
        Log.d(this@GameViewModel.javaClass.simpleName, "onCleared: ");
    }

    
}
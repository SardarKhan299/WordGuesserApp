package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore:Int):ViewModel() {
    init {
        Log.d(this@ScoreViewModel.javaClass.simpleName, "Final Score is :$finalScore ");
    }
}
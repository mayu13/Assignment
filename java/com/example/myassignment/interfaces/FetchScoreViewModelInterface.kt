package com.example.myassignment.interfaces

import androidx.lifecycle.LiveData

interface FetchScoreViewModelInterface {
    var isLoadingInitial: LiveData<Boolean>
    var isLoadingMore: LiveData<Boolean>
}
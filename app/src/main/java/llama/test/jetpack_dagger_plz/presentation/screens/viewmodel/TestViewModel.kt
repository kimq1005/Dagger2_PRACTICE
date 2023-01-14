package llama.test.jetpack_dagger_plz.presentation.screens.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import llama.test.jetpack_dagger_plz.BaseAplication_HiltComponents.ViewModelC
import llama.test.jetpack_dagger_plz.domain.repository.TestRepo
import llama.test.jetpack_dagger_plz.utils.Common.TAG
import llama.test.jetpack_dagger_plz.utils.RemoteResult
import llama.test.jetpack_dagger_plz.utils.Resource
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(private val testRepo: TestRepo) : ViewModel() {

    fun plz(){
        viewModelScope.launch {
            testRepo.getNewsEveryThing("q","436a7b507ee5433bafa1ad67c8eff93b").let {
                when(it.status){
                    RemoteResult.Status.SUCCESS->{
                        Log.d(TAG, "success: fksjdhfzsudkjf ${it.data}")
                    }
                    else->{
                        Log.d(TAG, "error: ${it.status}")
                    }
                }
            }
        }
    }

    fun wow(){
        viewModelScope.launch {
            testRepo.getNewsArticles().let {
                when(it.status){
                    RemoteResult.Status.SUCCESS->{
                        Log.d(TAG, "SUCCESS: ${it.message} -> ${it.data}")
                    }

                    else->{
                        Log.d(TAG, "ERROR: ${it.status}-> ${it.message}")
                    }
                }
            }
        }
    }
}
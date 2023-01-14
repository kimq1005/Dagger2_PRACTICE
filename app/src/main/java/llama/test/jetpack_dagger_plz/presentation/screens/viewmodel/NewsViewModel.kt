package llama.test.jetpack_dagger_plz.presentation.screens.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import llama.test.jetpack_dagger_plz.domain.use_case.GetNewsArticleUseCase
import llama.test.jetpack_dagger_plz.presentation.HomeStateHolder
import llama.test.jetpack_dagger_plz.utils.Common.TAG
import llama.test.jetpack_dagger_plz.utils.Resource
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase) :
    ViewModel() {

    val articles = mutableStateOf(HomeStateHolder())

    init {
//        getNewsArticles()
        getNewsTest()
    }

    fun getNewsArticles(){
//        getNewsArticleUseCase().onEach {
//            when(it){
//                is Resource.Loading->{
//                    articles.value = HomeStateHolder(isLoading = true)
//                    Log.d(TAG, "getNewsArticles: ${it.message}")
//                }
//                is Resource.Success->{
//                    articles.value = HomeStateHolder(data = it.data)
//
//                    Log.d(TAG, "getNewsArticles: ${it.message}, ${it.data!![0].title ?: ""}")
//                }
//                is Resource.Error->{
//                    articles.value = HomeStateHolder(error = it.message.toString())
//                    Log.d(TAG, "getNewsArticles: ${it.message}")
//                }
//            }
//        }.launchIn(viewModelScope)
    }


    fun getNewsTest(){
        Log.d(TAG, "getNewsTest: fuck")
        viewModelScope.launch {
            getNewsArticleUseCase.wow("tesla", "436a7b507ee5433bafa1ad67c8eff93b").let {
                it.onEach {
                    when(it){
                        is Resource.Success->{
                            Log.d(TAG, "SUCCESS: ${it.data}")
                        }

                        else->{
                            Log.d(TAG, "failed: ${it.message}")
                        }
                    }
                }
            }
        }
    }


}
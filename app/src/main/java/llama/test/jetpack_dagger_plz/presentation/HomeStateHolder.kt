package llama.test.jetpack_dagger_plz.presentation

import llama.test.jetpack_dagger_plz.domain.model.Article

data class HomeStateHolder(
    val isLoading:Boolean=false,
    val data:List<Article>?=null,
    val error:String= " "
)

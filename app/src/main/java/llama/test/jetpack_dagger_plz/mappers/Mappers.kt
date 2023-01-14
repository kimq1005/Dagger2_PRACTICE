package llama.test.jetpack_dagger_plz.mappers

import llama.test.jetpack_dagger_plz.data.model.ArticleDTO
import llama.test.jetpack_dagger_plz.data.model.testdto.ArticleTestDTO
import llama.test.jetpack_dagger_plz.domain.model.Article
import llama.test.jetpack_dagger_plz.domain.model.ArticleTest

fun List<ArticleDTO>.toDomain() : List<Article>{
    return map{
        Article(
            content = it.content?:"",
            description = it.description?:"",
            title = it.title?:"",
            urlToImage = it.urlToImage?:""
        )
    }
}

fun List<ArticleTestDTO>.toTestDomain() : List<ArticleTest>{
    return map{
        ArticleTest(
            content = it.content ?: "",
            title = it.title ?: ""
        )
    }
}
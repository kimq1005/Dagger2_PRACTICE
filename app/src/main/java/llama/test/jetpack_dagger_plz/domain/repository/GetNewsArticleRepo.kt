package llama.test.jetpack_dagger_plz.domain.repository

import llama.test.jetpack_dagger_plz.domain.model.Article
import llama.test.jetpack_dagger_plz.domain.model.ArticleTest

interface GetNewsArticleRepo {

    suspend fun getNewsArticles() : List<Article>

    suspend fun getNewsEveryThing(q:String, apikey:String) : List<ArticleTest>
}
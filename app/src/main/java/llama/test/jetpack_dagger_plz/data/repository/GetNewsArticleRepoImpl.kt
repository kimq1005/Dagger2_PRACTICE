package llama.test.jetpack_dagger_plz.data.repository

import llama.test.jetpack_dagger_plz.data.network.ApiService
import llama.test.jetpack_dagger_plz.domain.model.Article
import llama.test.jetpack_dagger_plz.domain.model.ArticleTest
import llama.test.jetpack_dagger_plz.domain.repository.GetNewsArticleRepo
import llama.test.jetpack_dagger_plz.mappers.toDomain
import llama.test.jetpack_dagger_plz.mappers.toTestDomain
import llama.test.jetpack_dagger_plz.utils.SafeApiRequest
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :
    GetNewsArticleRepo, SafeApiRequest() {
    override suspend fun getNewsArticles(): List<Article> {
        val response = safeApiRequest { apiService.getNewsArticles() }
        return response?.articles?.toDomain()!!
    }

    override suspend fun getNewsEveryThing(q: String, apikey: String): List<ArticleTest> {
        val response = safeApiRequest { apiService.getNewsEveryThing(q,apikey) }
        return response.articleTestDTOS.toTestDomain()
    }

}
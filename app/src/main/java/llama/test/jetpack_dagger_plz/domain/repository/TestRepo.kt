package llama.test.jetpack_dagger_plz.domain.repository

import llama.test.jetpack_dagger_plz.data.model.NewsDTO
import llama.test.jetpack_dagger_plz.data.model.testdto.NewsTestDTO
import llama.test.jetpack_dagger_plz.domain.model.Article
import llama.test.jetpack_dagger_plz.domain.model.ArticleTest
import llama.test.jetpack_dagger_plz.utils.RemoteResult

interface TestRepo {

    suspend fun getNewsEveryThing(q:String, apikey:String) : RemoteResult<NewsTestDTO>

    suspend fun getNewsArticles() : RemoteResult<NewsDTO>
}
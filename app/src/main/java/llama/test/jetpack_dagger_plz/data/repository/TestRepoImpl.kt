package llama.test.jetpack_dagger_plz.data.repository

import llama.test.jetpack_dagger_plz.data.model.NewsDTO
import llama.test.jetpack_dagger_plz.data.model.testdto.NewsTestDTO
import llama.test.jetpack_dagger_plz.data.network.ApiService
import llama.test.jetpack_dagger_plz.domain.model.Article
import llama.test.jetpack_dagger_plz.domain.repository.TestRepo
import llama.test.jetpack_dagger_plz.utils.BaseDataSource
import llama.test.jetpack_dagger_plz.utils.RemoteResult
import javax.inject.Inject

class TestRepoImpl @Inject constructor(private val apiservice: ApiService)
    : TestRepo, BaseDataSource() {
    override suspend fun getNewsEveryThing(q: String, apikey: String): RemoteResult<NewsTestDTO> =
        getResult {
            apiservice.getNewsEveryThing(q, apikey)
        }

    override suspend fun getNewsArticles(): RemoteResult<NewsDTO> = getResult{
        apiservice.getNewsArticles()
    }

}
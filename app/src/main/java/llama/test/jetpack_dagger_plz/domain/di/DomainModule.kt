package llama.test.jetpack_dagger_plz.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import llama.test.jetpack_dagger_plz.data.network.ApiService
import llama.test.jetpack_dagger_plz.data.repository.GetNewsArticleRepoImpl
import llama.test.jetpack_dagger_plz.data.repository.TestRepoImpl
import llama.test.jetpack_dagger_plz.domain.repository.GetNewsArticleRepo
import llama.test.jetpack_dagger_plz.domain.repository.TestRepo

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideGetNewRepo(apiService: ApiService) : GetNewsArticleRepo{
        return GetNewsArticleRepoImpl(apiService)
    }

    @Provides
    fun provideTestRepo(apiService: ApiService) : TestRepo{
        return TestRepoImpl(apiService)
    }

}
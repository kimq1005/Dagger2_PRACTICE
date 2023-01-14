package llama.test.jetpack_dagger_plz.domain.use_case

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import llama.test.jetpack_dagger_plz.domain.model.Article
import llama.test.jetpack_dagger_plz.domain.model.ArticleTest
import llama.test.jetpack_dagger_plz.domain.repository.GetNewsArticleRepo
import llama.test.jetpack_dagger_plz.utils.Common.TAG
import llama.test.jetpack_dagger_plz.utils.Resource


class GetNewsArticleUseCase @Inject constructor(private val getNewsArticleRepo: GetNewsArticleRepo) {
//
//    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
//        emit(Resource.Loading(""))
//        try{
//            emit(Resource.Success(getNewsArticleRepo.getNewsArticles()))
//
//        }catch (e:Exception) {
//            emit(Resource.Error(e.message))
//        }
//    }


    fun wow(q:String, api:String): Flow<Resource<List<ArticleTest>>> = flow {
        emit(Resource.Loading(""))
        try{
            Log.d(TAG, "wow: wowowwo")
            emit(Resource.Success(getNewsArticleRepo.getNewsEveryThing(q, api)))

        }catch (e:Exception) {
            Log.d(TAG, "wow: $e")
            emit(Resource.Error(e.message))
        }
    }


}
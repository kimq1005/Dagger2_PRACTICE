package llama.test.jetpack_dagger_plz.data.model


import com.google.gson.annotations.SerializedName

data class ArticleDTO(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: SourceDTO?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
)
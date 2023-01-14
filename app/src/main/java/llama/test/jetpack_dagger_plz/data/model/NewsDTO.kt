package llama.test.jetpack_dagger_plz.data.model


data class NewsDTO(
    val articles: List<ArticleDTO>?,
    val status: String?,
    val totalResults: Int?
)
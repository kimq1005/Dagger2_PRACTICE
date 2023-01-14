package llama.test.jetpack_dagger_plz.domain.model

import llama.test.jetpack_dagger_plz.data.model.SourceDTO

data class Article(
    val content: String,
    val description: String,
    val title: String,
    val urlToImage: String
)
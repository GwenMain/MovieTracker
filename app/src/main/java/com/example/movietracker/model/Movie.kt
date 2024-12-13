data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    var isWatched: Boolean = false,
    var isLiked: Boolean? = null
)

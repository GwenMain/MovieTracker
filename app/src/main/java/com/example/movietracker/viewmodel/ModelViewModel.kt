import androidx.lifecycle.ViewModel

class MovieViewModel : ViewModel() {

    val movies = mutableListOf(
        Movie(1, "Inception", "A mind-bending thriller"),
        Movie(2, "The Matrix", "Welcome to the real world"),
        Movie(3, "Interstellar", "Space exploration with a twist")
    )

    fun updateMovie(movieId: Int, isWatched: Boolean, isLiked: Boolean? = null) {
        movies.find { it.id == movieId }?.apply {
            this.isWatched = isWatched
            this.isLiked = isLiked
        }
    }

    fun getWatchedMovies(filterLiked: Boolean?): List<Movie> {
        return movies.filter { it.isWatched && (filterLiked == null || it.isLiked == filterLiked) }
    }
}

public class Netflix {
	public static void main(String[] args) {
		Movie Ender = new Movie("Ender's Game", 9);
		Movie SW = new Movie("Star Wars E. 5", 7);
		Movie Hunt = new Movie("The Hunt for Red October", 8);
		Movie maze = new Movie("Maze Runner", 8);
		Movie Pi = new Movie("Life of Pi", 8);
		Movie Journey = new Movie("The 100 foot journey", 8);
		System.out.println(Ender.getTitle());
		NetflixQueue netflixQueue = new NetflixQueue();
		netflixQueue.addMovie(Ender);
		netflixQueue.addMovie(SW);
		netflixQueue.addMovie(maze);
		netflixQueue.addMovie(Hunt);
		netflixQueue.addMovie(Pi);
		netflixQueue.addMovie(Journey);
		netflixQueue.printMovies();
		System.out.println("The best movie is " + netflixQueue.getBestMovie());
		netflixQueue.sortMoviesByRating();
		System.out.println("The second best movie is "
				+ netflixQueue.getMovie(1));
	}
}
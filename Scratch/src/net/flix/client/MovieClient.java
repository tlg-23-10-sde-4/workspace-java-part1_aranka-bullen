package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {
    public static void main(String[] args) {
        // create and new instance of movie and set it properties with the default ctor
        Movie movie1 = new Movie("Akira");
        movie1.setReleaseYear(1988);
        movie1.setRevenue(240_000_00.00);
        movie1.setRating(Rating.R);
        movie1.setGenre(Genre.SPORTS_ROMANCE);
        System.out.println(movie1); // the toString of movie is automatically call
                                    // it is equivalent to movie1.toString().

        // create a new instance of movie and set it properties with a 3-argument ctor.
        Movie movie2 = new Movie("Iron Man", 2008, 29_000_000_000.00, Rating.PG_13, Genre.ACTION);
        System.out.println(movie2);


        //create and new instance of movie and set its properties with a 1-argument ctor.
        Movie movie3 = new Movie("Jay to Jay", Genre.WESTERN);
        System.out.println(movie3);
    }
}
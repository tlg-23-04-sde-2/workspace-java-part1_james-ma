package net.flix;

class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The Grey");
        movie1.setReleaseYear(2011);
        movie1.setRevenue(102_000_000.0);
        System.out.println(movie1);

        Movie movie2 = new Movie("Inception", 2008, 5_000_000_000.0, Rating.R, Genre.THRILLER);
        System.out.println(movie2);

        Movie movie3 = new Movie("Avatar", Genre.SCI_FI);
        System.out.println(movie3);


    }
}
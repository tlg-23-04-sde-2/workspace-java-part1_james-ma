package net.flix;

class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // Constructor
    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear) {
        this(title);
        setReleaseYear(releaseYear);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title);                    // delegate to ctor above for title
        setReleaseYear(releaseYear);    //delegate to its setter
        setRevenue(revenue);            // dito
        setRating(rating);
        setGenre(genre);
    }
    // business methods


    // accessor methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return "net.flix.Movie: title=" + getTitle() + ", release year=" + getReleaseYear() +
                ", revenue=" + getRevenue() + ", genre= " + getGenre();
    }
}
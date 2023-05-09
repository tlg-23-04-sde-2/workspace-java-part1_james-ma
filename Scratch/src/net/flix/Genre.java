package net.flix;

enum Genre {
    // 8 named net.flix.Genre instances
    // Each calls the ctor below, passing a display string
    ROMANCE("Romance"),
    SCI_FI("Sci-Fi"),
    COMEDY("Comedy"),
    DOCUMENTARY("Documentary"),
    ACTION("Action"),
    THRILLER("Thriller"),
    HORROR("Horror"),
    DRAMA("Drama");

    // everything below here is regular class definition stuff, i.e., fields, ctors, methods
    private final String display;

    // constructor - implicitly private, only called when inside (8 times above)
    Genre(String display) {
        this.display = display;
    }

    // accessor methods - "ready-only"
    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}
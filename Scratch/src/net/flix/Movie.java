package net.flix;

public class Movie {

    //FIELDS OR INSTANCE VARIABLES
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // CONSTRUCTORS: These get called when the client-code calls for  a "new" instance of a class.

   //public net.flix.Movie(){  //default ctor/no-arg ctor
    //}

    public Movie(String title) { //1-arg ctor
        setTitle(title);  //delegate to setter for any validation conversion it might be doing
    }
    public Movie(String title, Genre genre){
        this(title);
        setGenre(genre);
    }
    public Movie(String title, int releaseYear) {       //Example of a 2-argument ctor
        this(title);     // <----titled is delegate to the 1-arg ctor by the 2-arg ctor.
        setReleaseYear(releaseYear);
    }

    public Movie( String title, int releaseYear, double revenue){ // 3-arg ctor
        this(title, releaseYear); // <----title and releaseYear are both called in the 2-arg and 3-arg ctor.
        setRevenue(revenue);
                            //Therefore, 3-arg ctor can delegate those fields to the 2-arg ctor, leaving
                            // only the revenue field to handle itself. This delegation of fields is
                            // is denoted by this(). The inside parameters hold the fields to be delegated
        //setTitle(title);
        //setReleaseYear(releaseYear);
    }
    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue);
        setRating(rating);
        setGenre(genre);
    }


    // BUSINESS/ACTION METHODS


    //ACCESSOR OR GETTER AND SETTER METHODS

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
    //TOSTRING METHODS

    public String toString() {
        //To Do: If revenue is null, you use %s and if not then use %,.2f
        String revenueFormat = (getRevenue() == null) ? "%s" : "%,.2f";

        /*   if- else statement version of the turnary statement above
        String revenueFormat = null;
        if (getRevenue() == null) {
            revenueFormat = "%s";
        }
        else {
            revenueFormat = "%s,.2f";
        }
        */
            return String.format("Title=%S, ReleaseYear=%s, Revenue=" +revenueFormat + ", Rating=%s, Genre=%s\n", getTitle(),
                    getReleaseYear(), getRevenue(), getRating(), getGenre());
        }

//        return getClass() +
//                " Title = " + getTitle() +
//                ", Release Year = " + getReleaseYear() +
//                ", Revenue = " + getRevenue() +
//                ", Rating = " + getRating() +
//                ",Genre = " + getGenre();
    }

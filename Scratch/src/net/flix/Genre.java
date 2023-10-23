package net.flix;

public enum Genre {
    HORROR ("HORROR"),
    HISTORICAL("Historical"),
    ACTION("Action!!"),
    COMEDY("Comdedy :^)"),
    SPORTS_ROMANCE("Sport Romance XOX"),



    WESTERN("Western");

    // Everything under here is regular class definition stuf: fields, ctor, methods
    private String display;

    Genre( String display){  //by definition, automatically private
        this.display =display;
        System.out.println("net.flix.Genre ctor called");
    }


    public String display() {  // this is a standard getter but just not named with get
        return display;
    }

    public String toString(){
        return display(); //generally better to call you own getter.
    }
}
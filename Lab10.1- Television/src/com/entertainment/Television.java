package com.entertainment;/*
 * This is the business class to model the workings of a com.entertainment.Television.
 */

public class Television {
    // CONSTANTS GO HERE
    public static final int MIN_VOLUME = 0;
    public static final  int MAX_VOLUME = 100;
    public static String[] VALID_BRANDS = {"Samsung", "Sony", "LG", "Toshiba"};
    private static int instanceCount = 0;

    // FIELDS OR INSTANCE VARIABLES ARE HERE
    //
    // attributes or properties - aka "fields" or "instance variables" in Java.
    /*
     * This is an example of DATA ENCAPSULATION. Note that instances variables (ex: brand) is "private".
     * This means that access to the instant is restricted and must be called upon through a public
     * instance. This is done using the accessor methods (EX: getBrand()). However, within the class
     * definition, private instance can be called BUT when called outside of the class definition, the
     * system will be unable recognized/pull the information due to the "private" setting without using the
     * accessor methods.
     */
    private String brand; // = "Toshiba";
    private int volume; // = 5;
    private boolean isMuted;  // provide a getter only
    private int oldVolume;   //completely hidden, no get/set methods
    private DisplayType display = DisplayType.LED;

    // CONSTRUCTORS ARE HERE
    /*
     * Constructors are a way for the client code to create a new instance of a class, without having to
     * set each instance variable one at a time. Instead, the instance variables can be called all at once
     * within the parameters brackets of a constructor.
     *
     * NOTE: when dealing with multiple constructors that have overlapping instance variables, typically
     * common with method overloading, a constructor can delegate the execution of an instance variable
     * to another constructor by usin this().
     *
     * All classes MUST have a constructor, and will be given a default no-arg ctor by the sytem if none
     * are explicitly stated. If the there are explicitly stated constructors than the default no-arg ctor
     * will not be given by the system and must be written by programmer.
     */

    public Television() { // no-arg ctor
        instanceCount++;
    }

    public Television(String brand) throws InvalidBrandException{  // 1-arg ctor
        this();    // delegates the execution of the instanceCount field of the no-arg ctor
        setBrand(brand);
    }
    public Television(String brand, int volume) throws IllegalArgumentException, InvalidBrandException{  // 2-arg ctor.  The "brand" instance variable is delegate to
        this(brand);                              // to the 1-arg ctor by the 2-arg ctor.
        setVolume(volume);
    }
    public Television(String brand, int volume, DisplayType display) throws  IllegalArgumentException, InvalidBrandException{
        this(brand,volume);
        setDisplay(display);

    }

    //BUSINESS/ACTION METHODS ARE HERE
    //
    // functions or operations - aka " action methods" in Java. What do com.entertainment.Television do?
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your "+ getBrand() + " TV to volume " + getVolume());
    }
    public void turnOff() {
        System.out.println("Shutting down " + getBrand() + " TV....Good-Bye");
    }
    public void mute() {
        if(!isMuted()) {
            oldVolume = getVolume();
            setVolume(0); // setVolume(MIN_VOLUME);
            isMuted =true;

        }
        else {
         setVolume(oldVolume);
         isMuted =false;
        }
    }

    /*
     * ACCESSOR METHODS AKA GETTER AND SETTERS ARE HERE
     *
     * once you have accessor methods installed and have private fields
     * It is very important that the get/set accessors (ex: getBrand)
     * are used in code instead of the private field variables (ex: brand)
     *
     *These private methods should be only called by the inside parameters.
    */

    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand; // <---- EX: These private methods should be only called by the inside
    }                  // parameters of the class definition. See how brand is purple?
                        // This b/c it is accessible in this class definition.

    public void setBrand(String brand) throws InvalidBrandException {
        switch (brand){
            case "Samsung":
            case "LG":
            case "Toshiba":
            case "Sony":
                this.brand = brand;
                break;
            default:
                throw new InvalidBrandException(String.format("The brand %s is an INVALID Brand.", brand));
        }
    }

    /*public void setBrand(String brand) {
        boolean valid = false;

        if (isValidBrand(brand)) {
                 this.brand = brand;
        }
        else {
            System.out.println(%s is an INVALID brand. Valid brands are %s.\n" ,
                 brand, Arrays.toString(VALID_BRANDS));
        }
    }
*/

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws IllegalArgumentException  {

        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false; // automatically unmuted
        }
        else {
            throw new IllegalArgumentException(String.format("Invalid volume: %s. Must be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME));   //way to throw exception if using printf statements

//            throw new IllegalArgumentException("The input volume: " + volume +" is NOT VALID. Valid entries is between "
//                    + MIN_VOLUME + " - " + MAX_VOLUME + ".");  //way to throw exception if using println (+ signs)
        }
    }

    public static int getInstanceCount() {  // only has a getter so it cannot be set, only
        return instanceCount;               // displayed. This gives it read-only properties
    }

    /*
     * This is an example of method cohesion. That is the exposed public method (turnOn()) calls on
     * private methods (verifyInternetConnection()) to complete an action. However, each of the private
     * methods are focused on one particular task.
     *
     * Also note that this is a form of ENCAPSULATING BEHAVIOR because access to an action type characteristic
     * is restricted AND must be called upon through a public business/action methods.
     */
    private boolean verifyInternetConnection() {
        return true;  // fake implementation
    }


    // TOSTRING METHODS ARE HERE
    /*
     * This method allows for the system to show the specifications/information of the called
     * upon instances of an object that was created on the client-code class.
     */


    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return String.format(" %s com.entertainment.Television: brand=%s, volume=%s, display=%s.", getClass(), getBrand(),
                volumeString, getDisplay());

    }

//   public String toString() {
//        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume()); // ex: of a turnery
//       return getClass() + " Brand: " + getBrand() + " Display: " + getDisplay() +  " Volume: " + volumeString;
//    }



}
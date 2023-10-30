package edu.geometry;



public interface Shape {
    //FIELDS:
    // Note: Interface fields are by default " public static final" and the variable names are capitalized.
    // The variables must also be initialized a value.

       //to do create


//        public  static  final double DIMENSION1 = Double.parseDouble(args[0]); // cannot be 0 must be set to user input
//        public  static final double DIMENSION2 = Double.parseDouble(args[1]);
//        public static final double DIMENSION3 =Double.parseDouble(args[2]);
//        public static final double ANGLE = Double.parseDouble(args[3]);


    // METHODS:
    // Note: Methods are abstract, meaning they do not have a body. They also do not have a return type i.e., "void"
    // "static".

    public double getUserInput();

    public double area();

    public double perimeter();

    // Note: if you want classes that implement the interface to automatically use a default method. The method must be
    // written the interface class, and it must contain a method body. Use the word "default" prior to the method name
    // to denote that the method is the standard baseline method called when implementing class do not have one listed
    // in their business class.


}
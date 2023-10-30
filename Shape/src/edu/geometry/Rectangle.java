package edu.geometry;

class Rectangle implements Shape {

    //fields
    double DIMENSION1;
    double DIMENSION2;

    //constructors
    public Rectangle() {
    }


    //methods
    @Override
    public double getUserInput(){

        return 0;
    }

    @Override
    public double area() {
        double areaRec;
        areaRec = DIMENSION1 * DIMENSION2;
        return areaRec;
    }

    @Override
    public double perimeter() {
       double perimeterRec;
        perimeterRec = (2 * DIMENSION1) + (2 * DIMENSION2);
        return perimeterRec;
    }
}
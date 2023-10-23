/*
 * This is the business method that sets the attributes/properties and its
 * method of execution.
 */


class Camera {

    // attributes
    String brand; // user input for camera brand
    String cameraModel; // user input for model of camera
    private double timer = 10.0; // default timer set to 10 seconds
    boolean hasBluetooth = true;
    int powerStatusOn; // constraints for battery save mode ON or Off
    int batteryStatus; // battery percent 0-100
    boolean isOn = false;



    //methods

    // 1. This method checks the power status of the camera. On or OFF
    //this needs to be more refined
    void isOn() {
    if (powerStatusOn == 0) {
        void turnOff() {   //To Do: combine turnOn and turnOff to a boolean isOn
            System.out.println("Camera OFF");

        }
        else {
        void turnOn() {
            powerStatusOn = 1;
            System.out.println("Camera ON");
        }
        }
    }

   // 2. This method is to capture an image or video

    void capture() {// Thi requires more work

        void takePicture(){
            System.out.println("CLICK");
        }
        void takeVideo() {
            System.out.println("Starting video....");
    }


    // 3. This method set a timer count down prior to taking a picture or video.
    }
    void photoTimer(double timer) {
        System.out.println("Counting down...");
        System.out.println(timer);
        --timer;
        if (timer == 0.0) {
            System.out.println("SMILE");
        }
    }

    // 4. This method checks the battery percentage of camera
    void checkBattery() { // constraints 0-100%
        System.out.println(" Battery is " + batteryStatus+ ". Please charge!");
    }

    // 5. This method allows user to connect to the bluetooth
    void connectBluetooth() {
            hasBluetooth = true;
            System.out.println("PAIRING...");
        }

    // accessor methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCameraModel() {
        return cameraModel;
    }

    public void setCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
    }

    public double getTimer() {
        return timer;
    }

    public void setTimer(double timer) {
        this.timer = timer;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public int getPowerStatusOn() {
        return powerStatusOn;
    }

    public void setPowerStatusOn(int powerStatusOn) {
        this.powerStatusOn = powerStatusOn;
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public void setOn(boolean on) {
        isOn = on;
    }


    //toString method
}
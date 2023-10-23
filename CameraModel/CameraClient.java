/*
 * Create instances of cameras and set their property
 */

class CameraClient {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.brand = "Canon";
        cam1.cameraModel = "ELPH 100 HS";
        cam1.hasBluetooth = false;


        Camera cam2 = new Camera();
        cam2.hasBluetooth = false;
        cam2.timer = 3;


        Camera cam3 = new Camera();
        cam3.hasBluetooth = true;
        cam3.batteryStatus = 65;



        //calling method on camera instances
        cam1.isOn();
        cam1.capture();
        cam1.connectBluetooth();
        cam1.checkBattery();


        cam2.photoTimer();
        cam2.capture();
        cam2.isOn();

        cam3.isOn();
        cam3.connectBluetooth();
    }



    //toString method called
}

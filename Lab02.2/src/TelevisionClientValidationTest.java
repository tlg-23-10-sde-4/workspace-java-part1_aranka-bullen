

class TelevisionClientValidationTest {

    public static void main(String[] args) {

        Television tv = new Television();
        System.out.println(tv);

        tv.setVolume(-1);
        System.out.println(tv.getVolume());

        tv.setVolume(0);
        System.out.println(tv.getVolume());

        tv.setVolume(100);
        System.out.println(tv.getVolume());

        tv.setVolume(101);
        System.out.println(tv.getVolume());

        System.out.println("______________\n");

        // This should validate the brand setter.
        System.out.println(tv);

        tv.setBrand("LG");
        System.out.println(tv.getBrand());

       tv.setBrand("Samsung");
        System.out.println(tv.getBrand());

        tv.setBrand("Toshiba");
       System.out.println(tv.getBrand());

       tv.setBrand("Sony");
        System.out.println(tv.getBrand());

       tv.setBrand("Vizio");
        System.out.println(tv.getBrand());

        System.out.println(tv);



    }

}
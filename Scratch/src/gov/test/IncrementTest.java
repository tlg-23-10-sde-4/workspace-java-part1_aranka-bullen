package gov.test;

class IncrementTest {
    public static void main(String[] args) {
    int i = 3;
        System.out.println(i);

        // This is an example of post-increment. The system will add one to i prior to
        //printing the input. Therefore, i will be 4.
        System.out.println(++i);

        //This is a pre-increment example. The system will add one to i after it prints
        //the current input for i. Therefore, i will be 4.
        System.out.println(i++);

        int x = 18;
        int y = 18;

        x++;

        System.out.println("X is " + x);
        System.out.println("Y is " + y);
    }
}

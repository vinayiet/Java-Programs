public class swaptwonumbers {
    // swap two variables without using third variable
    public static void swap(int a, int b) {
        System.out.println("The value of a and b before swaping " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The value of a and b before swaping " + a + " " + b);

    }

    public static void main(String args[]) {
        int a = 3;
        int b = 9;
        swap(a, b);

    }

}

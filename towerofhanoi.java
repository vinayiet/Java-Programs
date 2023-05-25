
public class towerofhanoi {
    public static void transfer(int n, String source, String medium, String des) {

        // base case of the given solution

        if (n == 1) {
            System.out.println("Transfer disk " + n + " " + source + " to " + des);
            return;

        }

        transfer(n - 1, source, medium, des);

        // transferring n-1 disk from source to helper
        System.out.println("Transfer disk " + (n) + " " + source + " to " + medium);

        transfer(n - 1, medium, source, des);

    }

    public static void main(String args[]) {
        transfer(2, "a", "b", "c");
    }
}
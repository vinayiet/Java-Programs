
public class binarystring {
    public static boolean print(String binary, int index) {
        // base case
        if (binary.charAt(index) == 1 && binary.charAt(index + 1) == 1) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String args[]) {
        String binary = "11";

    }

}

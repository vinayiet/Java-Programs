public class numintowords {
    static String number[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void print(int input) {
        // base case
        if (input == 0) {
            return;

        }
        // kaam
        int lastdigit = input % 10;
        print(input / 10);
        // printing the number into words
        System.out.print(number[lastdigit] + " ");
    }

    public static void main(String args[]) {

        int input = 1234;
        print(input);

    }

}

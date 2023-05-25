public class charpalindrome {
    public static boolean check(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                System.out.println("this is a palindrome.");
                return true;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        String str = "racecar";
        System.out.println(check(str));
    }

}

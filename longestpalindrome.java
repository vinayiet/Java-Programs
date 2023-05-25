public class longestpalindrome {
    public static String largestPalinodrome(String str, int n) {
        String largeststring = "";
        if (n / 2 == 0) {
            for (int i = n / 2; i < n; i++) {
                if (str.charAt(i) == str.charAt(n - i)) {

                    largeststring += str.charAt(i);
                }
            }
        }
        return largeststring;

    }

    public static void main(String args[]) {
        String str = "aaabaa";
        int n = str.length() - 1;
        System.out.println(largestPalinodrome(str, n));

    }

}

public class reversewords {
    public static String reverse(String[] str) {
        String s = new String("");
        int n = str.length;
        for (int i = 1; i < n; i++) {
            int c = str.length;
            s += c;
        }
        return s;

    }

    public static void main(String args[]) {
        String[] str = { "abc.def.fgh" };
        System.out.println(reverse(str));

    }

}

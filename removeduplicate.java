public class removeduplicate {
    public static void removeduplicate1(int indx, StringBuilder sb, String str, boolean map[]) {
        if (indx == str.length()) {
            System.out.println(sb);
            return;
        }
        char currentchar = str.charAt(indx);
        //
        if (map[currentchar - 'a'] == true) {
            removeduplicate1(indx + 1, sb, str, map);
        } else {
            map[currentchar - 'a'] = true;
            removeduplicate1(indx + 1, sb.append(currentchar), str, map);
        }

    }

    public static void main(String args[]) {
        String str = "apnacollege";
        removeduplicate1(0, new StringBuilder(""), str, new boolean[26]);
    }

}

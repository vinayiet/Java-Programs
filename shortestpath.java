public class shortestpath {
    public static int findshortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            // for east direction
            if (path.charAt(i) == 'E') {
                y++;
            }
            // for west direction

            else if (path.charAt(i) == 'W') {
                y--;
            }
            // for north direction
            else if (path.charAt(i) == 'N') {
                x--;
            }
            // for north direction
            else {
                x++;
            }

        }
        int X = x * x;
        int Y = y * y;

        return (int) Math.sqrt(X + Y);
    }

    public static void main(String args[]) {
        String path = "ENSNNW";
        System.out.println(findshortestpath(path));
    }

}

import java.util.*;

public class hey {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println("list by arraylist :" + list);
        list.set(1, 3);
        System.out.println("set by arralist " + list);
        int size = list.size();
        System.out.println("size :" + size);
        list.remove(2);
        System.out.println("after removing the index :" + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("get elements by arraylist " + list.get(i));
        }
        System.out.println();
        list.add(8);
        list.add(5);
        list.add(6);
        System.out.println("list:" + list);
        Collections.sort(list);
        System.out.println("sorting :" + list);

    }
}
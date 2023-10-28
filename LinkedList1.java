package CollectionFramework;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("vishal");
        l.add(23);
        l.add(null);
        l.add("vishal");
        System.out.println(l);
        l.set(0,"tdit");
        l.add(0,"java");
        System.out.println(l);
        l.removeLast();
        l.addFirst("hey");
        System.out.println(l);
    }
}

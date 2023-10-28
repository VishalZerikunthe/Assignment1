package CollectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        System.out.println(l);
        ListIterator ltr=l.listIterator();
        while (ltr.hasNext()){
            String s=(String) ltr.next();
            if(s.equals("A")){
                ltr.remove();
            } else if (s.equals("B")) {
                ltr.add("F");
            } else if (s.equals("C")) {
                ltr.set("G");
            }
        }
        System.out.println(l);
    }
}

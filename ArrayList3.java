package CollectionFramework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("A");
        a.add(10);
        a.add('A');
        a.add(null);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"M");
        a.add("N");
        System.out.println(a);

        LinkedList l=new LinkedList();
        System.out.println(a instanceof Serializable);
        System.out.println(a instanceof Cloneable);
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        System.out.println(a instanceof RandomAccess);
        System.out.println(l instanceof RandomAccess);
    }
}

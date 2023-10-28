package CollectionFramework;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector v=new Vector();
        System.out.println(v.capacity());
        for (int i = 0; i <10 ; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
        System.out.println(v);

        Vector v1=new Vector(100);
        System.out.println(v1.capacity());
        Vector v2=new Vector(10,5);
        System.out.println(v2.capacity());
    }
}

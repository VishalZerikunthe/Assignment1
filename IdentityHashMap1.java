package CollectionFramework;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMap1 {
    public static void main(String[] args) {
        HashMap m=new HashMap<>();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        m.put(i1,"pawan");
        m.put(i2,"vishal");
        System.out.println(m);

        IdentityHashMap I=new IdentityHashMap<>();
        I.put(i1,"pawan");
        I.put(i2,"vishal");
        System.out.println(I);
    }
}

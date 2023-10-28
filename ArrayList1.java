package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        List obj= Collections.synchronizedList(a);
        System.out.println(obj.isEmpty());
        obj.add(100);
        obj.add(2000000l);
        obj.add(true);
        obj.add('c');
        obj.add("hello");
        obj.add(1.50f);
        System.out.println(obj);
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println(obj.contains('c'));
        System.out.println(obj.get(3));

        ArrayList a2=new ArrayList();
        ArrayList <Integer> a3=new <Integer> ArrayList();
    }
}

package CollectionFramework;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add("hi");
        a1.add('e');
        System.out.println(a1);
        System.out.println(a1.size());

        ArrayList a2=new ArrayList();
        a2.add(a1);
        System.out.println(a2);
        System.out.println(a2.size());
        for (int i = 0; i <a2.size() ; i++) {
            System.out.println(a2.get(i));
        }
        ArrayList a3=new ArrayList();
        a3.addAll(0,a1);
        System.out.println(a3);
        System.out.println(a3.toArray());
        System.out.println(a3.size());
        for (int i = 0; i <a3.size(); i++) {
            System.out.println(a3.get(i));
        }
    }
}

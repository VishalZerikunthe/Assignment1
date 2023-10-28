package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet h1=new HashSet();
        System.out.println(h1.size());
        HashSet h2=new HashSet(20);
        System.out.println(h2.size());
        HashSet h3=new HashSet(20, 0.85F);
        System.out.println(h3.size());
        ArrayList a=new ArrayList();
        HashSet h4=new HashSet(a);
        System.out.println(h4.size());
    }
}

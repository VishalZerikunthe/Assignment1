package CollectionFramework;

import java.util.TreeSet;

public class TreeSetClassCastException1 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("M"));
        t.add(new StringBuffer("B"));
        System.out.println(t);
    }
}

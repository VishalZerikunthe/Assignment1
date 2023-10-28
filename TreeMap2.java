package CollectionFramework;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap2 {
    public static void main(String[] args) {
        TreeMap t=new TreeMap<>(new MyComparatorCustom());
        t.put("xxx",10);
        t.put("aaa",20);
        t.put("zzz",30);
        t.put("lll",40);
        System.out.println(t);
    }
}

class MyComparatorCustom implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}

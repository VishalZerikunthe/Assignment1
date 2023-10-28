package CollectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class StringReverseSorting {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator1());
        t.add("Raja");
        t.add("Shobha");
        t.add("Roja");
        t.add("Ganga");
        t.add("Ramu");
        System.out.println(t);
    }
}

class MyComparator1 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=(String) o2;
        return -s1.compareTo(s2);
//        return s2.compareTo(s1);
    }
}

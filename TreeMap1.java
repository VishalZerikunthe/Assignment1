package CollectionFramework;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap t=new TreeMap();
        t.put(100,"xxx");
        t.put(103,"yyy");
        t.put(101,"zzz");
        t.put(104,106);
        //t.put("abc","xyz");   //-->ClassCastException
        //t.put(null,"xxx");   //-->NullPointerException
        System.out.println(t);
    }
}

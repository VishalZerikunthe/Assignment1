package CollectionFramework;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap m=new HashMap<>();
        m.put("Chiru",700);
        m.put("Bala",800);
        m.put("venkat",200);
        m.put("nag",500);
        System.out.println(m);
        System.out.println(m.put("Chiru",1000));
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);

        Set s1=m.entrySet();
        System.out.println(s1);

        Iterator itr=s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey()+"----"+m1.getValue());
            if (m1.getKey().equals("nag")){
                m1.setValue(10000);
            }
        }
        System.out.println(m);
    }
}


class Demo{
    public static void main(String[] args) {
        String s1="java";
        String s2=new String("java");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

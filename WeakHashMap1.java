package CollectionFramework;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMap1 {
    public static void main(String[] args) throws InterruptedException {
        HashMap m=new HashMap<>();
        Temp t1=new Temp();
        m.put(t1,"xuz");
        System.out.println(m);
        t1=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);

        WeakHashMap w=new WeakHashMap<>();
        Temp t2=new Temp();
        w.put(t2,"abc");
        System.out.println(w);
        t2=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(w);
    }
}

class Temp{
    public String toString(){
        return "temp";
    }
    @Override
    public void finalize(){
        System.out.println("finalize method call");
    }
}

package CollectionFramework;

import java.util.Hashtable;

class Temperory{
    int i;
    Temperory(int i){
        this.i=i;
    }
    @Override
    public int hashCode() {
        return i;

    }
    public String toString(){
        return i+" ";
    }
}

public class Hashtable1{

    public static void main(String[] args) {
        Hashtable h=new Hashtable();
        h.put(new Temperory(5),"A");
        h.put(new Temperory(2),"B");
        h.put(new Temperory(6),"C");
        h.put(new Temperory(15),"D");
        h.put(new Temperory(23),"E");
        h.put(new Temperory(16),"F");
//        h.put(new Temperory(13),null);    //-->NullPointerException
        System.out.println(h);
    }
}

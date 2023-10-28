package CollectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

class
Employee implements Comparable{
    String ename;
    int eid;
    Employee(String ename, int eid){
        this.ename=ename;
        this.eid=eid;
    }
    public String toString(){
        return ename+"--"+eid;
    }
    @Override
    public int compareTo(Object obj) {
        int eid1=this.eid;
        Employee e=(Employee) obj;
        int eid2=e.eid;
        if (eid1<eid2){
            return -1;
        } else if (eid1>eid2) {
            return +1;
        }
        else
            return 0;
    }
}
public class EmployeeSorting {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vishal", 100);
        Employee e2 = new Employee("Shailesh", 200);
        Employee e3 = new Employee("Rohit", 50);
        Employee e4 = new Employee("Angad", 150);
        Employee e5 = new Employee("Sumit", 110);
        TreeSet t1 = new TreeSet<>();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);
        System.out.println("--------------------------------");
        TreeSet t2=new TreeSet<>(new MyComparator4());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println(t2);
    }
}


class MyComparator4 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee) o1;
        Employee e2=(Employee) o2;
        String s1=e1.ename;
        String s2=e2.ename;
        return s1.compareTo(s2);
    }
}
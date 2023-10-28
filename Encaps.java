package Encapsulation;

class A{
    String name;
    int age;
    String job;
    private double sal;
    double getSal(){
        return sal;
    }
    void setSal(double salary){
        this.sal=salary;
    }
    A(String a, int b,String c,double d){
        this.name=a;
        this.age=b;
        this.job=c;
        this.sal=d;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Job: "+job);
        System.out.println("Salary: "+sal);
    }
}

public class Encaps {
    public static void main(String[] args) {
        A obj=new A("vishal",22,"Sde",20000);
        obj.display();
       // System.out.println(obj.getSal());
        obj.setSal(30000);
        obj.display();

    }
}

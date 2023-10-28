package Exceptions;

class Parent{
    void demo(){
        System.out.println("hello");
    }
}

class Child{
    void main(){
        System.out.println("hi");
    }
}

class SubChild{
    void demo2(){
        System.out.println("hi hello");
    }
}
public class ClassCastException {
    public static void main(String[] args) throws java.lang.ClassCastException {
        SubChild sc=new SubChild();
           // Child c = sc;
    }
}

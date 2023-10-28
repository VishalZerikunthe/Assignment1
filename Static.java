package BasicPrograms;

public class Static {
    static int a=10;
    int b=20;
    static {
        a=20;
        System.out.println(a);
        //b=40;
       // System.out.println(b);
    }
    {
        a=30;
        b=50;
        System.out.println(a);
        System.out.println(b);
    }
    Static(){}
    void m1(){
        Static obj1=new Static();
    }
    static  void m2(){
        Static obj2=new Static();
    }

    public static void main(String[] args) {
        Static obj= new Static();

    }
}

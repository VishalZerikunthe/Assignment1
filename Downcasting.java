package DerivedTypeCasing;

class Programming{
    void coding(){

        System.out.println("code in program");
    }
}

class Java extends Programming{
    void learn(){

        System.out.println("learn java");
    }
}

class Oops extends Java{
    void revise(){

        System.out.println("revise oops");
    }
}
public class Downcasting {
    public static void main(String[] args) {
        Oops obj=new Oops();
        Programming P=obj;
        System.out.println("------------------------------");

        //Downcasting from Programming to Java
        Java J=(Java) P;
        J.coding();
        J.learn();
        System.out.println("------------------------------");

        //Downcasting from Java to Oops
        Oops O=(Oops) J;
        O.coding();
        O.learn();
        O.revise();
    }
}

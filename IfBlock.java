package DecisionMaking;

public class IfBlock {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        if(a>b){
            System.out.println("if block executed ");
        }
    }
}

class IfBlock1{
    public static void main(String[] args) {
        System.out.println("outside if");
        if(true){
            System.out.println("inside if");
        }
        System.out.println("main ends");
    }
}

class IfBlock2{
    public static void main(String[] args) {
        System.out.println("main starts");
        if(false)
            System.out.println("inside if");
        System.out.println("outside if");
    }
}

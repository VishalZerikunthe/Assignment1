package DecisionMaking;

public class IfElseBlock {
    public static void main(String[] args) {
        System.out.println("main start");
        if(true){
            System.out.println("inside if");
        }
        else{
            System.out.println("inside else");
        }
        System.out.println("main ends");
    }
}

class IfElse1{
    public static void main(String[] args) {
        int a=10,b=20;
        if(a!=b&&a<b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}


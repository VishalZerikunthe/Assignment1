package DecisionMaking;

public class ElseIfLadder {
    public static void main(String[] args) {
        int a=10,b=20;
        if(a>b){
            System.out.println(1);
        }
        else if (true) {
            System.out.println("elseif1 block");
        }
        else if (true) {
            System.out.println("elseif2 block");
        }
    }
}

class ElseIfLadder1{
    public static void main(String[] args) {
        if(false){
            System.out.println(1);
        }
        else if (true) {
            System.out.println(2);
        }
        else if (false) {
            System.out.println(3);
        }
        else{
            System.out.println(4);
        }
    }
}
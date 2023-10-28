package DecisionMaking;

public class Nested {
    public static void main(String[] args) {
        int a=1,b=2;
        if(a<b){
            if(false){
                System.out.println(2);
                if(true){
                    System.out.println(1);
                }
            }
            else{
                System.out.println(0);
            }
        }
    }
}

package DecisionMaking;

public class Switch {
    public static void main(String[] args) {
        int n=10;
        switch (n%2){
            case 0:{
                System.out.println("even num");
                break;
            }
            case 1:{
                System.out.println("odd num");
            }
        }
    }
}

class Switch1{
    public static void main(String[] args) {
        switch('a'){
            case 'b':{
                System.out.println(1);
                break;
            }
            case 'a':{
                System.out.println(0);
            }
        }
    }
}

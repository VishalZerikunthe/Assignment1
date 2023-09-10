package Assignment1;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        int num=5;
        double fact=1;
        for (int i = num; i >0 ; i--) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

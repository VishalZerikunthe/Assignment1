package Assignment1;

public class FactorialOfNumUsingWhileLoop {
    public static void main(String[] args) {
        int n=5,fact=1;
        while (n>0){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}

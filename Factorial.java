package BasicPrograms;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int factorial=1;
        for (i = 5; i >0 ; i--) {
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
}

class A{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x= sc.nextInt();
    BigInteger fact=new BigInteger(1+"");
        for (int i = 1; i <=x ; i++) {
            BigInteger temp=new BigInteger(i+"");
            fact=fact.multiply(temp);
        }
        System.out.println(fact);
    }
}

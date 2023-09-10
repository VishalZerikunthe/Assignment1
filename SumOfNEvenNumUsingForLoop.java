package Assignment1;

public class SumOfNEvenNumUsingForLoop {
    public static void main(String[] args) {
        int n=10,sum=0;
        for (int i = 1; i <=2*n; i++) {
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

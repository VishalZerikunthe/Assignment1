package Assignment1;

public class SumOfNumOccuringInMultiplicationTable {
    public static void main(String[] args) {
        int n=8,sum=0;
        for (int i = 1; i <=10 ; i++) {
            sum=sum+(n*i);
        }
        System.out.println(sum);
        System.out.println(8+16+24+32+40+48+56+64+72+80);
    }
}

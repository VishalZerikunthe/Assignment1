package Assignment1;

public class SumOfnEvenNum {
    public static void main(String[] args) {
        int sum=0,n=1,count=0,num=10;
        while(count<num){
            if(n%2==0){
                sum+=n;
                count++;
            }
            n++;
        }
        System.out.println(sum);
        System.out.println(2+4+6+8+10+12+14+16+18+20);
    }
}

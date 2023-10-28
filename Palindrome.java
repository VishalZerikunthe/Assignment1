package BasicPrograms;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        int temp1=num,temp=0;
        while (num>0){
            temp=num%10;
            sum=(sum*10)+temp;
            num=num/10;

        }
      //  System.out.println(sum);
        if(temp1==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }

    }
}
class M{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        String res= String.valueOf(sb.reverse());
        if(res.equals(str)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not");
        }

    }
}

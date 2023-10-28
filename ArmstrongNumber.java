package BasicPrograms;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0,temp=0,temp2=0,sum=0;
        temp=num;
        while(temp>0){
           temp=temp/10;
           count++;
        }
        temp=num;
        while(temp>0){
            temp2=temp%10;
            sum+=Math.pow(temp2,count);
            temp=temp/10;
        }
        System.out.println(sum);
        if (num==sum){
            System.out.println("armstrng");
        }
        else{
            System.out.println("not");
        }

    }
}


class ArmstrongNumberUsingInstance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArmstrongNumberUsingInstance obj=new ArmstrongNumberUsingInstance();
        if(obj.isArmstrong(n)){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not");
        }

    }
    boolean isArmstrong(int num){
        int temp1=0,temp2=0,sum=0,count=0;
        temp1=num;
        while(temp1>0){
            temp1=temp1/10;
            count++;
        }
        temp1=num;
        while (temp1>0){
            temp2=temp1%10;
            sum+=Math.pow(temp2,count);
            temp1=temp1/10;
        }
        if(num==sum) {
            return true;
        }
        else {
            return false;
        }
    }
}
package BasicPrograms;

import java.util.Scanner;

public class Sept29 {
}

//1. Write a program to print all natural numbers from 1 to n
class One{
    public static void main(String[] args) {
        int n=100;
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+" ");
        }
    }
}

//2. Write a program to print all natural numbers in reverse
class Two{
    public static void main(String[] args) {
        int n=100;
        for (int i = n; i >0 ; i--) {
            System.out.print(i+" ");
        }
    }
}

//3. Write a program to print tables
class Three{
    public static void main(String[] args) {
        int n=8;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}

//4. Write a program to print reverse tables
class Four{
    public static void main(String[] args) {
        int n=8;
        for (int i = 10; i >0 ; i--) {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}

//5. Write a program to print all alphabets from a to z
class Five{
    public static void main(String[] args) {
        for (int i = 'a'; i <='z' ; i++) {
            char c=(char)i;
            System.out.print(c+" ");
        }
    }
}

//6. Write a program to print reverse alphabets from Z to A
class Six{
    public static void main(String[] args) {
        for (int i = 'z'; i >='a' ; i--) {
            char c=(char)i;
            System.out.print(c+" ");
        }
    }
}

//7. Write a program to print all even numbers between 1 to 100
class Seven{
    public static void main(String[] args) {
        int n=100;
        for (int i = 1; i <=n ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

//8. Write a program to print all odd number between 1 to 100
class Eight{
    public static void main(String[] args) {
        int n=100;
        for (int i = 1; i <=n ; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}

//9. Write a program to find sum of all natural numbers between 1 to n
class Nine{
    public static void main(String[] args) {
        int n=10,sum=0;
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

//10. Write a program to find sum of all even numbers between 1 to n
class Ten{
    public static void main(String[] args) {
        int n=10,sum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}

//11. Write a program to find sum of all odd numbers between 1 to n
class Eleven{
    public static void main(String[] args) {
        int n=10,sum=0;
        for (int i = 1; i <=n ; i++) {
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}

//12. Write a program to print the ASCII values
class Twelve{
    public static void main(String[] args) {
        for (int i = 'a'; i <='z' ; i++) {
            char c=(char)i;
            System.out.println("Ascii value of "+c+":"+i);
        }
    }
}

//13. Write a program to find the factorial value of any number
class Thirteen{
    public static void main(String[] args) {
        int n=5,fact=1;
        while (n>0){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}

//14. Write a program to find the value of one number raised to the power of another
class Fourteen{
    public static void main(String[] args) {
        int n=5,power=4,res=1;
        for (int i=1;i<=power;i++){
            res=res*n;
        }
        System.out.println(res);
    }
}

//15. write a program to reverse the given Digits
class Fifteen{
    public static void main(String[] args) {
        int n=123;
        int res=0,temp=n;
        while(n>0) {
            temp= n % 10;
            res=(res*10)+temp;
            n=n/10;
        }
        System.out.println(res);
    }
}

//16. write a program to sum of its Digits
class Sixteen{
    public static void main(String[] args) {
        int num=123;
        int sum=0,temp=num;
        while (num>0){
            temp=num%10;
            sum=sum+temp;
            num=num/10;
        }
        System.out.println(sum);
    }
}

//17. write a program to Check Whether a Given Number is Prime or Not
class Seventeen{
    public static void main(String[] args) {
        int num=13;
        int count=0;
        for (int i = 1; i <=num ; i++) {
            if (num%2==0){
                count++;
            }
        }
        if (count<=2){
            System.out.println("prime");
        }
    }
}

//18. Write a program to calculate HCF of Two given number
class Eighteen{
    public static void main(String[] args) {
        int num1=8,num2=12,rem=0,hcf=0;
        do {
            rem=num1%num2;
            if(rem==0){
                hcf=num2;
            }
            else {
                num1=num2;
                num2=rem;
            }
        }
        while (rem!=0);
        System.out.println(hcf);
    }
}

//19. Write a program to enter the numbers till the user wants and
// at the end it should display the count of positive, negative and zeros entered
class Ninteen{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your num");
        int num= sc.nextInt();
        int positive=0,negative=0,zero=0;
        char c;
        do {
            if (num>0){
                positive++;
            }
            else if (num<0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("want to continue y/n");
            c=sc.next().charAt(0);
        }
        while (c=='y'||c=='Y');
        System.out.println("positive num "+positive);
        System.out.println("negative num "+negative);
        System.out.println("zeros are "+zero);
    }
}
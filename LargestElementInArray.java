package Array;
import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest number in array "+max);

    }
}

class LargestChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[]arr=new char[5];
        String str=sc.next();
        char max= 'a';
        for (int i = 0; i < str.length() ; i++) {
            arr[i]=str.charAt(i);
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element is "+max);
    }
}

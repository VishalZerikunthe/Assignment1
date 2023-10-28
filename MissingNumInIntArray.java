package Array;

public class MissingNumInIntArray {
    public static void main(String[] args) {
        int miss=10;
        int[]a=new int[100];
        for (int i = 0; i <100 ; i++) {
            a[i]=i+1;
            //System.out.print(a[i]+" ");
            if(a[i]==miss){
                System.out.println("missing num found at index value "+i);
            }
        }
    }
}




class TwoNumMiss{
    public static void main(String[] args) {
        int a=25;
        int b=56;
        missingNum(a,b);
    }
    static void missingNum(int a, int b){
        int[]arr=new int[100];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i+1;
            if (arr[i]==a){
                System.out.println("first missing number found at index value "+i);
            } else if (arr[i]==b) {
                System.out.println("second missing number found at index value "+i);
            }
        }
    }
}
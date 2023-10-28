package Array;
public class NotRepeatedElement {
    public static void main(String[] args) {
        int count=0;
        int[]arr={1,2,3,2,1};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.print(arr[i]);
            }
        }
    }
}



class A {
    static int method(int []arr)
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return 1;
    }
    public static void main (String[] args) {
        int arr[] = {1,2,3,2,3};
        System.out.println(method(arr));
    }
}
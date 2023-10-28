package Array;

public class UpdatingValue {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6};
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        //update value
        arr1[3]=100;
        arr1[4]=200;
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        System.out.println("--------------------------------------------");

        int[]arr2=new int[6];
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
        //update value
        arr2[3]=100;
        arr2[4]=200;
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
    }
}

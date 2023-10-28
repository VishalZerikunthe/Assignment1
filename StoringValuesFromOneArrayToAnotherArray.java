package Array;
public class StoringValuesFromOneArrayToAnotherArray {
    static int b;
    void test(){
        b=100;
        StoringValuesFromOneArrayToAnotherArray obj=new StoringValuesFromOneArrayToAnotherArray();
        System.out.println(obj.b);
    }
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2=new int[arr1.length];
        arr2=arr1;
        System.out.print("array 1= [ ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("array 2= [ ");
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.print("]");
        new StoringValuesFromOneArrayToAnotherArray().test();
    }
}

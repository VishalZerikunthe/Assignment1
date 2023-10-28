package Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []arr={1,2,3,2,1};
        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}



class Array{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,5,2,6,8,4,5,6,9,7,1};
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]) {
                    count++;
                    if(count>=2){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }
    }
}
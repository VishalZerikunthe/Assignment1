package Array;

public class CountOfPairs {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,9,10,11,12};
        int sum=8;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if(a[i] + a[j] == sum){
                    System.out.println("["+a[i]+","+a[j]+"]");
                }
            }
        }
    }
}


class Method2{
    static void countPairs(int[]arr,int sum){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,5,2,6,8,4,5,6,9,7,1};
        int sum=10;
        countPairs(arr,sum);
    }
}
package Array;

public class FindingValuePresentInArrayOrNot {
    static void search(int[]a,int key){
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==key){
                System.out.println("value found at index value "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int key=6;
        int[] a={1,2,3,4,5,6,7,8,9};
        search(a,key);
    }
}

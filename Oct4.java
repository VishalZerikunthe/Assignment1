package Array;

public class Oct4{
    static void array(double[]args){
        double avg=0, sum=0;
        for (int i = 0; i < args.length; i++) {
            sum=sum+args[i];
        }
        avg=sum/ args.length;
        double []array={avg,sum};
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        double[]arr={1,2,3,4,5,6,7,8,9,10};
        array(arr);
    }
}

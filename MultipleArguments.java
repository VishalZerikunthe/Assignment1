package StringProg;

public class MultipleArguments {
    static float getAvg(float ...x){
        float total=0;
        for (int i=0;i<x.length;i++){
            total+=x[i];
        }
        return total/x.length;
    }

    public static void main(String[] args) {
       float avg1= getAvg(1,2,3,4,5,6,7,8,9,10);
        System.out.println(avg1);
    }
}






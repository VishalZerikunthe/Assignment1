package Array;

public class FindingMaximumPercentsOfThreeStudents {
    //method to find sum
    static double getSum(double[]arr){
        double sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    //method to find maximum among three
    static void getMax(double a,double b,double c){
        if(a>b){
            if(a>c){
                System.out.println("Rank 1 is student1+ "+a);
            }
        }
        else{
            if(b>c){
                System.out.println("Rank 1 is student2+ "+b);
            }
            else{
                System.out.println("Rank 1 is student3+ "+c);
            }
        }
    }

    static double getPercent(double...x){
        double sum=0,percent=0;
        for (int i = 0; i <x.length ; i++) {
            sum=sum+x[i];
        }
        percent=sum/x.length;
        return percent;
    }

    public static void main(String[] args) {
        double[]student1={75.25,68.20,80.15,65.25,35.80};
        double[]student2={75.40,68.50,85.20,65.20,75.20};
        double[]student3={74.60,55.35,69.10,85,44.10};

        double sum1=getSum(student1);
        //double student1percent=(sum1/500)*100;
        double student1percent=getPercent(student1);

        double sum2=getSum(student2);
        //double student2percent=(sum2/500)*100;
        double student2percent=getPercent(student2);

        double sum3=getSum(student3);
        //double student3percent=(sum3/500)*100;
        double student3percent=getPercent(student3);
        getMax(student1percent,student2percent,student3percent);
    }
}

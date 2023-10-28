package Array;

public class SumOfCharArray {
    public static void main(String[] args) {
        char[]charArray={'v','i','s','h','a','l'};
        String strSum="";
        int sum=0;
        for (int i = 0; i < charArray.length ; i++) {
            sum=sum+charArray[i];
            strSum=strSum+charArray[i];
        }
        System.out.println(sum);
        System.out.println(strSum);
    }
}

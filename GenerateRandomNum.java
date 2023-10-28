package BasicPrograms;
import java.util.Random;
public class GenerateRandomNum {
    public static void main(String[] args) {
        Random num=new Random();
        int b=num.nextInt(100);
        System.out.println(b);
    }
}

package StringProg;
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="Reverse String";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        sb.length();
        System.out.println(sb);
        System.out.println(sb.length());
    }
}

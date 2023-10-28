package ExceptionHandling;

import java.io.File;
import java.util.Scanner;

public class IOException {
    public static void main(String[] args) throws java.io.IOException {
        String str="abc.txt";
        Scanner sc=new Scanner(new File(str));
    }
}

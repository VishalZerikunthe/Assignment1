package ExceptionHandling;
import java.io.*;
import java.util.*;
public class FileNotFoundException extends Throwable {
    public static void main(String[] args) throws FileNotFoundException, java.io.FileNotFoundException {
        String dir = "missingfile.txt";
        Scanner sc=new Scanner(new File(dir));
    }
}

package ExceptionHandling;

public class ClassNotFoundException{
    public static void main(String[] args) throws java.lang.ClassNotFoundException{
        Class.forName("hi");
    }
}

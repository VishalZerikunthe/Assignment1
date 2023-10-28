//package ExceptionHandling;
//
//import java.util.Scanner;
//
//class TooYoungException extends RuntimeException{
//    TooYoungException(String msg){
//        super(msg);
//    }
//}
//
//class TooOldException extends RuntimeException{
//    TooOldException(String msg){
//        super(msg);
//    }
//}
//
//
//public class UserDefinedException {
//    //It is highly recommended that user defined excepptionss should be unchecked
//    //user defined exceptions are used to show something is going wrong in code
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int age= sc.nextInt();
//        if(age>60){
//            throw new TooOldException("you aree out of our age limt");
//        }
//        else if (age<18) {
//            throw new TooYoungException("wait for some more time you will get best match");
//        }
//        else{
//            System.out.println("thanks for registering");
//        }
//    }
//
//}

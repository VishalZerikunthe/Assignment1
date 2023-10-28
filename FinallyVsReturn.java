//package ExceptionHandling;
//
//public class FinallyVsReturn {
//    public static void main(String[] args) {
//        try {
//            System.out.println("hello");
//            return;
//        }
//        catch (Exception e){
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("finally");
//        }
//    }
//}
//
//class Demo {
//    static int m1(){
//        try{
//            return 100;
//        }
//        catch (Exception e){
//            return 200;
//        }
//        finally {
//            return 300;
//        }
//    }
//    public static void main(String[] args) {
//        m1();
//    }
//}
//
//class SystemExit{
//    public static void main(String[] args) {
//        try{
//            System.out.println("try");
//            System.exit(0);
//        }
//        catch (Exception e){
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("finally");
//        }
//    }
//}

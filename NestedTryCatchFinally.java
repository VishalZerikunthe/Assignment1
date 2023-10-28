//package ExceptionHandling;
//
//public class NestedTryCatchFinally {
//    public static void main(String[] args) {
//        try{
//            System.out.println("outer try");
//            try {
//                System.out.println(10/0);
//            }
//            catch (ArithmeticException e){
//                System.out.println("inner catch");
//            }
//            finally {
//                System.out.println("inner finally");
//            }
//        }
//        catch (Exception e){
//            System.out.println("outer catch");
//        }
//        finally {
//            System.out.println("outer finally");
//        }
//    }
//}
//
//class SpecialClass{
//    public static void main(String[] args) {
//        try{
//            System.out.println("inner try");
//            try{
//                System.out.println(10/0);
//            }
//            catch(NullPointerException e){
//                System.out.println("inner catch");
//            }
//            finally {
//                System.out.println("inner finally");
//            }
//        }
//        catch(Exception e){
//            System.out.println("outer catch");
//        }
//        finally {
//            System.out.println("outer finally");
//        }
//    }
//}

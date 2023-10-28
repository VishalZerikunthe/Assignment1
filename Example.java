package ExceptionHandling;

public class Example {
    public static void main(String[] args) {
        Example obj=new Example();
        try{
            obj.test();
            int a=10/0;
        }
//        catch (NullPointerException e){
//            System.out.println("catch 1");
//            e.getStackTrace();
//        }
//        catch (ArithmeticException A){
//            System.out.println("catch 2");
//            A.getStackTrace();
//        }

        catch (ArithmeticException A){
            System.out.println("catch 2");
            A.getStackTrace();
        }

        catch (Exception ee){
            System.out.println("catch 3");
            ee.getStackTrace();
        }
    }
    void test(){
        System.out.println("test");
    }
}

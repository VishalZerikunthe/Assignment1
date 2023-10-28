package ExceptionHandling;

public class IllegalThreadStateException extends Thread {
     public void start(){
        System.out.println("start");
    }
    public static void main(String[] args) throws java.lang.InterruptedException {
         IllegalThreadStateException Thread=new IllegalThreadStateException();
        Thread.start();
        Thread.sleep(1000);
        Thread.start();
    }
}

package GarbageCollection;

public class CallingFinalizeExplicitly {
    public static void main(String[] args) {
        CallingFinalizeExplicitly obj1=new CallingFinalizeExplicitly();
        obj1.finalize();
        obj1.finalize();
        obj1=null;
        System.gc();
        System.out.println("End of Main()");
    }
    protected void finalize(){

        System.out.println("finalize() called");
    }
}

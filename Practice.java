package Encapsulation;

public class Practice {
    private String str="hello";
    private int val=123;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }


    public static void main(String[] args) {
        Practice obj=new Practice();
        System.out.println(obj.getStr());
        System.out.println(obj.getVal());
        obj.setStr(obj.getStr()+" World");
        obj.setVal(55);
        System.out.println(obj.getStr());
        System.out.println(obj.getVal());
    }
}


class Practice2 {
    private String Method;

    public String getMethod() {
            return Method;
        }
        public void setMethod(String method) {
            this.Method = method;
        }
        Practice2 Method2() {
            Practice2 obj = new Practice2();
            System.out.println("Method in SOUT");
            obj.setMethod("MMMMMM");
            return obj;
        }
        public static void main(String[] args) {
            Practice2 obj1 = new Practice2();
            Practice2 obj2 = obj1.Method2();
            String firstname = obj2.getMethod();
            System.out.println("Value of object is " + firstname);

            Practice2 object = new Practice2();
            Practice2 object2 = object.Method2();
            String firstname2 = object2.getMethod();
            firstname2 = firstname2.concat("programming Lang ");
            System.out.println("value of method is " + firstname2);
        }
    }


class Practice3{
    private int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    Practice3 method(){
        Practice3 obj1 = new Practice3();
        System.out.println("Method in SOUT");
        obj1.setValue(12);
        return obj1;
    }

    public static void main(String[] args) {
        Practice3 obj1 = new Practice3();
        Practice3 obj2 = obj1.method();
        Practice3 value= obj2.method();
    }



}
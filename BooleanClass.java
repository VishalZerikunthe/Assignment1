package BasicPrograms;

public class BooleanClass {
    private boolean aBooleanvalue=true;
    private int anInt=20;

    public int getAnInt() {

        return anInt;
    }

    public boolean isaBooleanvalue() {

        return aBooleanvalue;
    }

    public void setaBooleanvalue(boolean aBooleanvalue) {

        this.aBooleanvalue = aBooleanvalue;
    }

    public void setAnInt(int anInt) {

        this.anInt = anInt;
    }
    BooleanClass(boolean a,int b){
        this.aBooleanvalue=a;
        this.anInt=b;
    }
    void dispaly(){
        System.out.println("boolean "+aBooleanvalue);
        System.out.println("int "+anInt);
    }
}
class Driver{
    public static void main(String[] args) {
        BooleanClass obj=new BooleanClass(true,20);
        obj.getAnInt();
        obj.isaBooleanvalue();
        obj.dispaly();
        obj.setaBooleanvalue(false);
        obj.setAnInt(30);
        obj.dispaly();
    }
}

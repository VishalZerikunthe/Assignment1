package CollectionFramework;

class Students{
    private String[] str=new String[10];
    private int size=0;
    public void add(String s){
        str[size]=s;
        size++;
        if (size==str.length){
            String[]newStr=new String[str.length*2];
            for (int i = 0; i < str.length ; i++) {
                str[i]=newStr[i];
            }
            str=newStr;
        }
    }
    public void remove(int index){
        if (index>=0 && index< str.length){
            for (int i = 0; i <size ; i++) {
                str[i]=str[i+1];
            }
            size--;
        }
    }
    public void remove(String s){
        int index=-1;
        for (int i = 0; i < size ; i++) {
            if (s.equals(str)){
                index=i;
                break;
            }
        }
        if (index!=-1){
            remove(index);
        }
    }
    public int getSize(){
        return size;
    }
    public String get(int index){
        if (index>=0 && index<size){
            return str[index];
        }
        else
            return "IndexOutOfBoundsException";
    }
}
public class CustomizedArrayList2 {
    public static void main(String[] args) {
        Students student=new Students();
        student.add("Student 1");
        student.add("Student 2");
        student.add("Student 3");
        student.add("Student 4");
        student.add("Student 5");
        student.add("Student 6");
        student.add("Student 7");
        student.add("Student 8");
        student.add("Student 9");
        student.add("Student 10");
        for (int i = 0; i < student.getSize() ; i++) {
            System.out.println(student.get(i));
        }
        System.out.println(student.getSize());
        System.out.println("----------------------------------------");
        student.remove(2);
        student.remove(5);
        student.remove(7);
        System.out.println(student.getSize());
    }
}

package CollectionFramework;

import java.util.Arrays;

class Customized {
    private String []array=new String[10];
    private int size=0;
    void add(String s){
        array[size]=s;
        size++;
        if (size==array.length){
            String[] newArray=new String[array.length*2];
            for (int i = 0; i <array.length ; i++) {
                array[i]=newArray[i];
            }
            array=newArray;
        }
    }
    void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }
    void remove(String s){
        int index=-1;
        for (int i = 0; i <size ; i++) {
            if (s.equals(array[i])){
                index=i;
                break;
            }
        }
        if (index!=-1){
            remove(index);
        }
    }
    int getSize(){
        return size;
    }
    String get(int index) {
        if(index>=0 && index<size) {
            return array[index];
        }
        else
            return "IndexOutOfBoundsException";
    }
}

public class CustomizedArrayList1 {
    public static void main(String[] args) {
        Customized employees=new Customized();
        employees.add("vishal");
        employees.add("shailesh");
        employees.add("rohit");
        employees.add("shubham");
        employees.add("ketki");
        System.out.println(employees.getSize());
        for (int i=0;i< employees.getSize();i++){
            System.out.println(employees.get(i));
        }
        System.out.println("----------------------------------");
        employees.remove(3);
        employees.remove(2);
        System.out.println(employees.getSize());
        for (int i=0;i< employees.getSize();i++){
            System.out.println(employees.get(i));
        }

    }
}












class CustomArrayList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] data;
    private int size;

    public CustomArrayList() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        ensureCapacity(size + 1);
        data[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) data[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        int numToMove = size - index - 1;
        if (numToMove > 0) {
            System.arraycopy(data, index + 1, data, index, numToMove);
        }
        data[--size] = null;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("List size: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        list.remove(2);

        System.out.println("After removing the element at index 2:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}

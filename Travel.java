package Encapsulation;

class A1{
    String name;
    String date;
    private String contact;
    int age;
    private String boarding;
    private String destination;
    char seat;
    String getContact(){
        return contact;
    }
    String getBoarding(){
        return boarding;
    }
    String getDestination(){
        return destination;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    A1(String a, String b, String c, int d, String e, String f, char g) {
        this.name = a;
        this.date = b;
        this.contact = c;
        this.age = d;
        this.boarding = e;
        this.destination = f;
        this.seat = g;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Date: "+date);
        System.out.println("Contact: "+contact);
        System.out.println("Age: "+age);
        System.out.println("Boarding: "+boarding);
        System.out.println("Destination: "+destination);
        System.out.println("Seat no.: "+seat);
    }
}
public class Travel {
    public static void main(String[] args) {
        A1 obj=new A1("Vishal","10/08/2023", "9168020504",22,"Udgir","Pune",'c');
        obj.display();
        obj.setBoarding("Latur");
        obj.setDestination("Mumbai");
        obj.setContact("9421518119");
        obj.display();

    }
}


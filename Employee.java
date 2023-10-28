package Encapsulation;
class  P{
    String ename;
    String empid;
    private double empsal;
    private String address;

    public double getEmpsal() {
        return empsal;
    }
    public String getAddress(){
        return address;
    }

    public void setEmpsal(double empsal) {
        this.empsal = empsal;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    P(String a, String b, double c, String d){
        this.ename=a;
        this.empid=b;
        this.empsal=c;
        this.address=d;
    }
    void display(){
        System.out.println("Employee Name: "+ename);
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Salary: "+empsal);
        System.out.println("Employee Address: "+address);
    }
}
public class Employee {
    public static void main(String[] args) {
        P obj=new P("Rohan","5678910",50000,"Warje");
        obj.display();
        obj.setEmpsal(100000);
        obj.setAddress("TDIT, Warje Bridge");
        obj.display();
    }
}

package Encapsulation;

class Expense{
    String Manufacturer;
    String Product;
    char Grade;
    String content;
    private String source;
    private double ManufacturingCost;
    private double TransportationCost;
    private double MarketingCost;
    double SellingPrice;

    public String getSource() {
        return source;
    }

    public double getManufacturingCost() {
        return ManufacturingCost;
    }

    public double getTransportationCost() {
        return TransportationCost;
    }

    public double getMarketingCost() {
        return MarketingCost;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setManufacturingCost(double manufacturingCost) {
        ManufacturingCost = manufacturingCost;
    }

    public void setTransportationCost(double transportationCost) {
        TransportationCost = transportationCost;
    }

    public void setMarketingCost(double marketingCost) {
        MarketingCost = marketingCost;
    }
    Expense(String a, String b,char c,String d,String e,double f, double g,double h,double i){
        this.Manufacturer=a;
        this.Product=b;
        this.Grade=c;
        this.content=d;
        this.source=e;
        this.ManufacturingCost=f;
        this.TransportationCost=g;
        this.MarketingCost=h;
        this.SellingPrice=i;
    }
    void display(){
        System.out.println("Manufacturer is "+Manufacturer);
        System.out.println("Product is "+Product);
        System.out.println("Grade is "+Grade);
        System.out.println("Content is "+content);
        System.out.println("Source is "+source);
        System.out.println("Manufacturing Cost is "+ManufacturingCost);
        System.out.println("Transportation Cost is "+TransportationCost);
        System.out.println("Marketing Cost is "+MarketingCost);
        System.out.println("MRP is "+SellingPrice);

    }
}
public class Product {
    public static void main(String[] args) {
        Expense obj=new Expense("Amul","Butterscotch Icecream",'A',"Butter","Country Delight",10,2,2.5,15);
        obj.display();
        System.out.println("--------------------------------------------");
        obj.setSource("Anveshan Farms");
        obj.setManufacturingCost(6);
        obj.setTransportationCost(1);
        obj.setMarketingCost(1);
        obj.display();

    }
}

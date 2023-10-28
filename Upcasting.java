package DerivedTypeCasing;

class Country{
    void festival(){
        System.out.println("fesival across world");
    }
}

class India extends Country{
    void nationalFestival() {
        System.out.println("Indian national festival");
    }
}

class Maharashtra extends India{
    void localFestival(){
        System.out.println("Mahrashtrian festivals");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        Maharashtra M1=new Maharashtra();
        M1.localFestival();
        M1.nationalFestival();
        M1.festival();

        System.out.println("------------------------------------------");

        //Upcasting from Maharashtra to India
        India I1=M1;
        I1.festival();
        I1.nationalFestival();

        System.out.println("--------------------------------------------");

        //Upcasting from India to Country
        Country C1=I1;
        C1.festival();
    }
}

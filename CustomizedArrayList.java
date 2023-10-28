package CollectionFramework;
import java.util.ArrayList;
public class CustomizedArrayList {
    int n = 4;
    class Data {
        long salary;
        String name;
        String email;
        long phone;
        Data(long salary, String name, String email, long phone)
        {
            this.salary = salary;
            this.name = name;
            this.email = email;
            this.phone = phone;
        }
    }
    public static void main(String args[])
    {
        String name[] = { "John", "Captain", "Thor", "Roger" };
        long phone[] = { 8269540012L, 8269540012L, 8269540012L, 8269540012L };
        String email[] = { "john@xyz.com", "captain@xyz.com", "thor@xyz.com", "roger@xyz.com" };
        long salary[] = { 100000, 90000, 190000, 80000 };
        CustomizedArrayList object = new CustomizedArrayList();
        object.addValues(salary, name, email, phone);
    }
    public void addValues(long salary[], String name[], String email[], long phone[])
    {
        ArrayList<Data> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Data(salary[i], name[i], email[i], phone[i]));
        }
        Display(list);
    }
    public void Display(ArrayList<Data> list)
    {
        for (int i = 0; i < n; i++) {
            Data data = list.get(i);
            System.out.println("Name: "+data.name + ", Phone:" + data.phone + ", Email:" + data.email + ", Salary:" + data.salary);
        }
    }
}

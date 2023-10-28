package Encapsulation;
class Context{
    private String Author;
    private String Title;
    private int id;
    public String getAuthor(){
        return Author;
    }
    public String getTitle(){
        return Title;
    }
    public int getId() {
        return id;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setId(int id) {
        this.id = id;
    }
    Context(String a,String b, int c){
        this.Author=a;
        this.Title=b;
        this.id=c;
    }
    void display(){
        System.out.println("Author is "+Author);
        System.out.println("Title is "+Title);
        System.out.println("ID is "+id);
    }
}
public class Book {
    public static void main(String[] args) {
        Context obj=new Context("Chetan Bhagat","Half Girlfriend",123);
        obj.display();
        System.out.println("---------------------------------------------------");
        obj.setAuthor("Sadhguru");
        obj.setTitle("Save Soil");
        obj.setId(100);
        obj.display();
    }
}

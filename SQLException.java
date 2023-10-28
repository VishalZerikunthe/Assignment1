package ExceptionHandling;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLException {
    public static void main(String[] args) throws java.sql.SQLException {
        Connection conn = DriverManager.getConnection("Database_URL");
    }
}

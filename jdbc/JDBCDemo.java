import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {
    public static void main(String[] args) {

        // Database details
        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String user = "root";
        String password = "Deepika@429";

        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. Check connection
            if (con != null) {
                System.out.println("✅ Database connection established successfully");
            }

            // 4. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
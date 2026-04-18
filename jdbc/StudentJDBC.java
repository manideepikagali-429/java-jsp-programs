import java.sql.*;

public class StudentJDBC {

    public static void main(String[] args) {

        String url =
            "jdbc:mysql://localhost:3306/jdbcdb";
        String user = "root";
        String password = "Deepika@429"; // change if needed

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connected successfully");

            // 3. Insert Record
            String insertSQL =
                "INSERT INTO student(rollno, name, section) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertSQL);

            ps.setInt(1, 101);
            ps.setString(2, "Rahul");
            ps.setString(3, "A");
            //-------
            ps.setInt(1, 102);
            ps.setString(2, "Bhargavi");
            ps.setString(3, "B");
            ps.executeUpdate();

            System.out.println("✔ Record inserted successfully");

            // 4. Display Records
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("\nRollNo | Name | Section");
            System.out.println("-----------------------");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("section")
                );
            }

            // 5. Close resources
            rs.close();
            stmt.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
import java.sql.*;
class PreparedStatementDemo {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcdb",
                "root",
                "Deepika@429"
            );
            PreparedStatement stmt = con.prepareStatement(
                "INSERT INTO emp VALUES (?, ?, ?)"
            );
            stmt.setInt(1, 101);
            stmt.setString(2, "Manideepika");
            stmt.setDate(3, Date.valueOf("2026-02-10"));
            stmt.executeUpdate();
            stmt.setInt(1, 102);
            stmt.setString(2, "Abhi");
            stmt.setDate(3, Date.valueOf("2025-08-11"));
            stmt.executeUpdate();
            stmt.setInt(1, 103);
            stmt.setString(2, "sharmila");
            stmt.setDate(3, Date.valueOf("2024-02-10"));
            stmt.executeUpdate();
            System.out.println("3 records inserted successfully");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
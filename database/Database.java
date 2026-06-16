
import java.sql.*;

public class Database {

    public static void main(String[] args) {
        try {

            // Defined class for a driver...
            Class.forName("com.mysql.jdbc.Driver");

            // Creating connection...
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root", "");
            System.out.println("Connection Created successfully....");

            // Creating Statement....
            Statement stm = conn.createStatement();

            String sql_create, sql_insert, sql_select;

            // SQL querry for creating table...
            sql_create = "CREATE TABLE students (id INTEGER PRIMARY KEY, name VARCHAR(255) NOT NULL, roll int)";
            stm.executeUpdate(sql_create);
            System.out.println("Table is created...");

            // SQL querry for Inserting data into table...
            sql_insert = "INSERT INTO students (1," + "Anil Adhikari" + ",1)";
            stm.executeUpdate(sql_insert);
            System.out.println("Record inserted sucessfully...");

            // SQL querry for Reading Data from the table...
            sql_select = "SELECT * FROM students";
            ResultSet result = stm.executeQuery(sql_select);
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                int roll = result.getInt("roll");

                System.out.println("ID: " + id + ", NAME: " + name + ", ROLL: " + roll);
            }

            conn.close();
            System.out.println("Connection Closed successfully....");

        } catch (SQLException e) {
            e.getMessage();
        }
    }
}

package classes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    public Connection dBConn() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_registration?autoReconnect=false&useSSL=false", "root", "");
            //JOptionPane.showMessageDialog(null, "Database Connected");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Not Connected Check your server and TRY AGAIN");
            System.exit(0);

        }
        return con;

    }
}

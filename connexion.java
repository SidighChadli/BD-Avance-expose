import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
import javax.swing.JOptionPane;
 
public class Connexion {
 
    static String url = "jdbc:mysql://localhost/etudiants";
    static String driver = "com.mysql.jdbc.Driver";
    static String user = "root";
    static String password = "1qaz";
 
    public static Connection getCon() {
        Connection con = null;
        //String message="Probleme de connection";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
 
        } catch (ClassNotFoundException | SQLException e) {
 
            String message = e.getMessage();
            JOptionPane.showMessageDialog(null, message);
 
        }
        return con;
 
    }
 
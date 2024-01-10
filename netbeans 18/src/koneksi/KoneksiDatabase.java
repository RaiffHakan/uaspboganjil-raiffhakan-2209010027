package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
public class KoneksiDatabase {
    //Connection am;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection aam = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa","java@localhost","password");
            return aam;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
            String user = "java@localhost";
            String pass="password";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil");
        }   catch (Exception e) {
            throw new RuntimeException("unhandled, e");
            //System.err.println("koneksi gagal" +e.getMessage());
        }
    }
}
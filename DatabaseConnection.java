import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            String url = "pt. bendi cars"; // Ganti dengan nama database Anda
            String username = "root"; // Username MySQL Anda
            String password = "";    // Password MySQL Anda
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return connection;
    }
}
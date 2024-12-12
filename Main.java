import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // URL database
        String url = "jdbc:mysql://localhost:3306/pt. bendi cars"; // Ganti nama_database kita
        String username = "root"; // Ganti username MySQL kita
        String password = "";     // Ganti password MySQL kita

        try {
            // Membuat koneksi ke database
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi berhasil!");
            
            // Tutup koneksi
            connection.close();
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}
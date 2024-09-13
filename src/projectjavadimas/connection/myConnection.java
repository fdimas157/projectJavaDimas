package projectjavadimas.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myConnection {
    public Connection koneksi;
    
    public Connection buatKoneksi(){
        if (koneksi == null){
            try {
                String db = "jdbc:mysql://localhost/pegadaian_project";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(db, user, pass);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e){
                System.out.println("Koneksi Gagal : " + e);
            }
        }
        return koneksi;
    }
}

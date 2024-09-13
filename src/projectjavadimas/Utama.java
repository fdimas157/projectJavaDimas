package projectjavadimas;

import projectjavadimas.connection.myConnection;

public class Utama {
    public static void main(String[] args) {
        myConnection connect = new myConnection();
        connect.buatKoneksi();
        
//        Login main = new Login();
//        main.setVisible(true);
    }
}

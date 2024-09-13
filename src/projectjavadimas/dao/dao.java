package projectjavadimas.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projectjavadimas.connection.myConnection;
import projectjavadimas.model.modelProject;

public class dao {
    myConnection konek;
    Connection koneksi;
    Statement stm;
    ResultSet r;
    modelProject mod = new modelProject();
    DefaultTableModel tb;
    Vector output;
    
    
    public dao(){
        konek = new myConnection();
        koneksi = konek.buatKoneksi();
    }
    
    public int login(modelProject mod){
        int cek = 0;
        try{
            stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("select * from anggota where username = '" + mod.getUsername() + "' and pass = '" + mod.getPassword() + "'");
            if(r.next()){
                if (mod.getUsername().equals(r.getString("username")) && mod.getPassword().equals(r.getString("pass"))){
                    JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Login");
                }
            }
            cek++;
        }
        catch (SQLException ex) {
            System.out.println("Terjadi kesalahan pada : " + ex);
        }
        return cek;
    }
    
    public int daftar(modelProject mod){
        int hasil = 0;
        try{
            stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("insert into anggota(username,pass,nama_depan,nama_belakang,no_hp,tgl_lahir,jenis_kelamin) values('" + mod.getUsername() + "','" + mod.getPassword() + "','" + mod.getNamdep() + "','" + mod.getNambel() + "','" + mod.getNo_hp() + "','" + mod.getTahun() + "-" + mod.getBulan() + "-" + mod.getTanggal() + "','" + mod.getJ_kelamin() + "')");
        }catch (SQLException ex) {
            System.out.println("Terjadi kesalahan" + ex);
        }
        return hasil;
    }
    
    public int langkah(modelProject mod, int tot){
        int hasil = 0;
        try {
            stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("insert into gadai values('" + mod.getUsername() + "','"+ mod.getJenis() + "'," + mod.getJumlah() + "," + mod.getBerat() + ",'" + mod.getSurat() + "','" + mod.getKantor() + "','" + mod.getJadwal_thn() + "-" + mod.getJadwal_bln() + "-" + mod.getJadwal_tgl() + "','" + mod.getWaktu() + "'," + tot + ")");
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan pada : " + e);
        }
        return hasil;
    }
    
    public DefaultTableModel tampilTabel(String u) throws SQLException {
        try {
            tb = new DefaultTableModel(new String[]{"USERNAME", "JENIS", "JUMLAH", "BERAT", "KELENGKAPAN", "KANTOR", "JADWAL", "WAKTU", "TOTAL"}, 0);
            stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("select * from gadai where username = '" + u + "'");
            while (r.next()) {
                tb.addRow(new Object[]{
                    r.getString("username"),
                    r.getString("jenis"),
                    r.getInt("jumlah"),
                    r.getInt("berat"),
                    r.getString("surat"),
                    r.getString("kantor"),
                    r.getString("jadwal"),
                    r.getString("waktu"),
                    r.getInt("total")
                });
            }
        } catch (SQLException ex) {
            System.out.println("Terjadi kesalahan pada : " + ex);
        }
        return tb;
    }
    
    public DefaultTableModel tabelAnggota(String u) throws SQLException {
        try {
            tb = new DefaultTableModel(new String[]{"USERNAME", "PASSWORD", "NAMA_DEPAN", "NAMA_BELAKANG", "NO_HP", "TGL_LAHIR", "JENIS_KELAMIN"}, 0);
            stm = (Statement) koneksi.createStatement();
            r = stm.executeQuery("select * from anggota where username = '" + u + "'");
            while (r.next()) {
                tb.addRow(new Object[]{
                    r.getString("username"),
                    r.getString("pass"),
                    r.getString("nama_depan"),
                    r.getString("nama_belakang"),
                    r.getString("no_hp"),
                    r.getString("tgl_lahir"),
                    r.getString("jenis_kelamin")
                });
            }
        } catch (SQLException ex) {
            System.out.println("Terjadi kesalahan pada : " + ex);
        }
        return tb;
    }
    
    public int hapusTransaksi(String tot){
        int hasil = 0;
        try {
            stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("delete from gadai where total = " + tot);
        } catch (Exception ex) {
            System.out.println("Terjadi kesalahan pada : " + ex);
        }
        return hasil;
    }
    
    public int editAnggota(modelProject mod, String u) {
        int hasil = 0;
        try {
            stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("update anggota set nama_depan = '" + mod.getNamdep()+ "', nama_belakang = '" + mod.getNambel() + "', no_hp = '" + mod.getNo_hp() + "',tgl_lahir = '" + mod.getTahun() + "-" + mod.getBulan() + "-" + mod.getTanggal() + "', jenis_kelamin = '" + mod.getJ_kelamin() + "' where username = '" + u + "'");
        } catch (SQLException ex) {
            System.out.println("Terjadi kesalahan pada : " + ex);
        }
        return hasil;
    }
    
}

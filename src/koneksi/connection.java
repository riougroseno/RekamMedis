package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class connection {
   public static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private Connection koneksi;
    public Connection connect (){
    try{
        Class.forName ("com.mysql.jdbc.Driver");
        System.out.println ("Berhasil Koneksi");
    }catch (ClassNotFoundException ex) {
    System.out.println ("Gagal Koneksi "+ex);
}
    String url ="jdbc:mysql://localhost/rekam_medis";
    try {
        koneksi = DriverManager.getConnection(url,"root","");
        System.out.println("Berhasil Koneksi Database");
} catch (SQLException ex){
    System.out.println ("Gagal Koneksi Database "+ex);
}
return koneksi;
}
    
}
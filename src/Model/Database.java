package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Database {
   
    Connection con;
    Statement stm;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/telkomuniversity", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
    
    public String getPassword(String username) {
        String pass = null;
        try {            
            String query = "select password from account where username='"
            + username + "';";
            ResultSet rs = stm.executeQuery(query);
            if (rs.next()) {
                pass =  rs.getString("password");
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat login!");            
        }        
        return pass;
    }        
    
    public String getLevel(String username) {
        String data = null;
        try {            
            String query = "select level from account where username='"
            + username + "';";
            ResultSet rs = stm.executeQuery(query);
            if (rs.next()) {
                data =  rs.getString("level");
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mendapatkan Level!");            
        }        
        return data;
    }
    
    public Admin loadAdmin(String username) {
        Admin n = null;
        try {
            String query = "select * from account where username='"
                    + username + "';";
            ResultSet rs = stm.executeQuery(query);
            if (rs.next()){
                n = new Admin(rs.getString("username"),rs.getString("password"),rs.getString("nama"),rs.getString("ID_Akun"));
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        return n;
    }
}

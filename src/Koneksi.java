/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EED
 */
public class Koneksi {
    private String url = "jdbc:mysql://localhost/vibrary";
    private String username = "root";
    private String password = "";
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return java.sql.DriverManager.getConnection(url, username, password);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex){
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ResultSet getQuery(Connection con, String sql) throws SQLException {
        return con.createStatement().executeQuery(sql);
    }
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        if(koneksi.getConnection() != null){
            javax.swing.JOptionPane.showMessageDialog(null, "Koneksi ok");
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
    }
}

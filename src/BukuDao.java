/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EED
 */
public class BukuDao {
    Connection con;
    
    public BukuDao(){
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
     public void create(Buku buku) throws SQLException{
        String sql="insert into buku values(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getId());
        ps.setString(2, buku.getJudul());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setInt(5, buku.getTahun());
        ps.setInt(6, buku.getIsbn());
        ps.setInt(7, buku.getIdKat());
        ps.executeUpdate();
    }
    
    public void update(Buku buku) throws SQLException{
        String sql="update  buku set judul=?, pengarang=?, penerbit=?, tahun=?, "
                +"isbn=?, idKat=?"
                +"where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(7, buku.getId());
        ps.setString(1,buku.getJudul());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getPenerbit());
        ps.setInt(4, buku.getTahun());
        ps.setInt(5, buku.getIsbn());
        ps.setInt(6, buku.getIdKat());
        ps.executeUpdate();
    }
    
    public void delete(String id) throws SQLException {
        String sql = "delete from buku where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        ps.executeUpdate();
    }
    
    public Buku getBuku(String id) throws SQLException {
        String sql = "select * from buku where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
       Buku buku = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            buku = new Buku();
            buku.setId(rs.getString(1));
            buku.setJudul(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahun(rs.getInt(5));
            buku.setIsbn(rs.getInt(6));
            buku.setIdKat(rs.getInt(7));
        }
        return buku;
    }
    
    public List<Buku> getAllBuku(Connection con) throws SQLException {
        String sql = "select * from buku";
        PreparedStatement ps = con.prepareStatement(sql);
        Buku buku;
        List<Buku> list = new ArrayList<Buku>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            buku = new Buku();
            buku.setId(rs.getString(1));
            buku.setJudul(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahun(rs.getInt(5));
            buku.setIsbn(rs.getInt(6));
            buku.setIdKat(rs.getInt(7));
            list.add(buku);
        }
        return list;
    }
}

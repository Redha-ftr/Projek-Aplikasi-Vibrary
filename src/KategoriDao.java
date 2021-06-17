
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EED
 */
public class KategoriDao {
    Connection con;
    
    public KategoriDao(){
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
    public void create(Kategori kat) throws SQLException{
        String sql="insert into kategori values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kat.getIdKat());
        ps.setString(2, kat.getJenis());
        ps.setInt(3, kat.getNoRak());
        ps.executeUpdate();
    }
    
    public void update(Kategori kat) throws SQLException{
        String sql="update  kategori set jenis=?, noRak=?"
                +"where idKat=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(3, kat.getIdKat());
        ps.setString(1, kat.getJenis());
        ps.setInt(2, kat.getNoRak());
        ps.executeUpdate();
    }
    
    public void delete(String id) throws SQLException {
        String sql = "delete from kategori where idKat=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        ps.executeUpdate();
    }
    
    public Kategori getKategori(String id) throws SQLException {
        String sql = "select * from kategori where idKat=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        Kategori kat = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            kat = new Kategori();
            kat.setIdKat(rs.getString(1));
            kat.setJenis(rs.getString(2));
            kat.setNoRak(Integer.parseInt(rs.getString(3)));
        }
        return kat;
    }
    
    public List<Kategori> getAllKategori(Connection con) throws SQLException {
        String sql = "select * from kategori";
        PreparedStatement ps = con.prepareStatement(sql);
        Kategori kat;
        List<Kategori> list = new ArrayList<Kategori>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            kat = new Kategori();
            kat.setIdKat(rs.getString(1));
            kat.setJenis(rs.getString(2));
            kat.setNoRak(Integer.parseInt(rs.getString(3)));
            list.add(kat);
        }
        return list;
    }
}

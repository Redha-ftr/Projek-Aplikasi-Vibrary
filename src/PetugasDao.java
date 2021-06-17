
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
public class PetugasDao {
    Connection con;
    
    public PetugasDao(){
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
    public void create(Petugas p) throws SQLException{
        String sql="insert into petugas values(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getId());
        ps.setString(2, p.getNama());
        ps.setString(3, p.getJk());
        ps.setString(4, p.getAlamat());
        ps.setInt(5, p.getNik());
        ps.setInt(6, p.getNotelp());
        ps.setString(7, p.getPassword());
        ps.executeUpdate();
    }
    
    public void update(Petugas p) throws SQLException{
        String sql="update  petugas set nama=?, jk=?, alamat=?,  "
                +"nik=?, notelp=?, password=? "
                +"where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(7, p.getId());
        ps.setString(1, p.getNama());
        ps.setString(2, p.getJk());
        ps.setString(3, p.getAlamat());
        ps.setInt(4, p.getNik());
        ps.setInt(5, p.getNotelp());
        ps.setString(6, p.getPassword());
        ps.executeUpdate();
    }
    
    public void delete(String id) throws SQLException {
        String sql = "delete from petugas where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        ps.executeUpdate();
    }
    
    public Petugas getPetugas(String id) throws SQLException {
        String sql = "select * from petugas where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        Petugas p = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new Petugas();
            p.setId(rs.getString(1));
            p.setNama(rs.getString(2));
            p.setJk(rs.getString(3));
            p.setAlamat(rs.getString(4));
            p.setNik(rs.getInt(5));
            p.setNotelp(rs.getInt(6));
            p.setPassword(rs.getString(7));
        }
        return p;
    }
    
    public List<Petugas> getAllPetugas(Connection con) throws SQLException {
        String sql = "select * from petugas";
        PreparedStatement ps = con.prepareStatement(sql);
        Petugas p;
        List<Petugas> list = new ArrayList<Petugas>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            p = new Petugas();
            p.setId(rs.getString(1));
            p.setNama(rs.getString(2));
            p.setJk(rs.getString(3));
            p.setAlamat(rs.getString(4));
            p.setNik(rs.getInt(5));
            p.setNotelp(rs.getInt(6));
            p.setPassword(rs.getString(7));
            list.add(p);
        }
        return list;
    }
}

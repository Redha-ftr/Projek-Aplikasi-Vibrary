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
public class AnggotaDao {
    Connection con;
    
    public AnggotaDao(){
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
    public void create(Anggota anggota) throws SQLException{
        String sql="insert into anggota values(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getId());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJk());
        ps.setString(5, anggota.getTglLahir());
        ps.setInt(6, anggota.getNotelp());
        ps.setInt(7, anggota.getNik());
        ps.executeUpdate();
    }
    
    public void update(Anggota anggota) throws SQLException{
        String sql="update  anggota set nama=?, alamat=?, jekel=?, "
                +"tgllahir=?, notelp=?, nik=? "
                +"where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4, anggota.getId());
        ps.setString(1, anggota.getNama());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3, anggota.getJk());
        ps.setString(5, anggota.getTglLahir());
        ps.setInt(6, anggota.getNotelp());
        ps.setInt(7, anggota.getNik());
        ps.executeUpdate();
    }
    
    public void delete(String id) throws SQLException {
        String sql = "delete from anggota where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        ps.executeUpdate();
    }
    
    public Anggota getAnggota(String kode) throws SQLException {
        String sql = "select * from anggota where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        Anggota anggota = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            anggota = new Anggota();
            anggota.setId(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJk(rs.getString(4));
            anggota.setTglLahir(rs.getString(5));
            anggota.setNotelp(rs.getInt(6));
            anggota.setNik(rs.getInt(7));
        }
        return anggota;
    }
    
    public List<Anggota> getAllAnggota(Connection con) throws SQLException {
        String sql = "select * from anggota";
        PreparedStatement ps = con.prepareStatement(sql);
        Anggota anggota;
        List<Anggota> list = new ArrayList<Anggota>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            anggota = new Anggota();
            anggota.setId(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJk(rs.getString(4));
             anggota.setTglLahir(rs.getString(5));
            anggota.setNotelp(rs.getInt(6));
            anggota.setNik(rs.getInt(7));
            list.add(anggota);
        }
        return list;
    }
    
}

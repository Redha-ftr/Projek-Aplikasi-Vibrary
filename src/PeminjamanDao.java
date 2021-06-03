
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
public class PeminjamanDao {
    Connection con;
    
    public PeminjamanDao(){
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
    public void create(Peminjaman pinjam) throws SQLException{
        String sql="insert into peminjaman values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pinjam.getIdPinjam());
        ps.setString(2, pinjam.getIdAnggota());
        ps.setString(3, pinjam.getIdBuku());
        ps.setString(4, pinjam.getIdPetugas());
        ps.setString(5, pinjam.getTglPinjam());
        ps.setString(6, pinjam.getTglKembali());
        ps.setString(7, pinjam.getStatus());
        ps.setInt(8, pinjam.getTerlambat());
        ps.setDouble(9, pinjam.getDenda());
        ps.executeUpdate();
    }
    
    public void update(Peminjaman pinjam) throws SQLException{
        String sql="update  peminjaman set tglkembali=?, status=?, terlambat=?, denda=? "
                + "where idPinjam=? and idAnggota=? and idBuku=? and idPetugas=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(5, pinjam.getIdPinjam());
        ps.setString(6, pinjam.getIdAnggota());
        ps.setString(7, pinjam.getIdBuku());
        ps.setString(8, pinjam.getIdPetugas());
        ps.setString(9, pinjam.getTglPinjam());
        ps.setString(1, pinjam.getTglKembali());
        ps.setString(2, pinjam.getStatus());
        ps.setInt(3, pinjam.getTerlambat());
        ps.setDouble(4, pinjam.getDenda());
        ps.executeUpdate();
    }
    
    public void delete(String idPinjam, String idAnggota, String idBuku, String idPetugas, String tglPinjam) throws SQLException {
        String sql = "delete from peminjaman where idpinjam and idanggota=? and idbuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, idPinjam);
        ps.setString(2, idAnggota);
        ps.setString(3, idBuku);
        ps.setString(4, tglPinjam);
        ps.executeUpdate();
    }
    
    public Peminjaman getPeminjaman (String idPinjam, String idAnggota, String idBuku, String idPetugas, String tglPinjam) throws SQLException {
        String sql = "select * from peminjaman where idAnggota=? and idBuku=? and idPetugas and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, idPinjam);
        ps.setString(2, idAnggota);
        ps.setString(3, idBuku);
        ps.setString(4, tglPinjam);
        Peminjaman pinjam = null;
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            pinjam = new Peminjaman();
            pinjam.setIdPinjam(rs.getString(1));
            pinjam.setIdAnggota(rs.getString(2));
            pinjam.setIdBuku(rs.getString(3));
            pinjam.setIdPetugas(rs.getString(4));
            pinjam.setTglPinjam(rs.getString(5));
            pinjam.setTglKembali(rs.getString(6));
            pinjam.setStatus(rs.getString(7));
            pinjam.setTerlambat(rs.getInt(8));
            pinjam.setDenda(rs.getDouble(9));
        }
        return pinjam;
    }
    
    public List<Peminjaman> getAllPeminjaman(Connection con) throws SQLException {
        String sql = "select * from peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        Peminjaman pinjam = null;
        List<Peminjaman> list = new ArrayList<Peminjaman>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            pinjam.setIdPinjam(rs.getString(1));
            pinjam.setIdAnggota(rs.getString(2));
            pinjam.setIdBuku(rs.getString(3));
            pinjam.setIdPetugas(rs.getString(4));
            pinjam.setTglPinjam(rs.getString(5));
            pinjam.setTglKembali(rs.getString(6));
            pinjam.setStatus(rs.getString(7));
            pinjam.setTerlambat(rs.getInt(8));
            pinjam.setDenda(rs.getDouble(9));
            list.add(pinjam);
        }
        return list;
    }
    
    /*public int getKurangTanggal(Connection con, String tgl1, String tgl2) throws SQLException{
        String sql = "select datediff(?,?) as hasil";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tgl1);
        ps.setString(2, tgl2);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            return rs.getInt(1);
        }
        return 0;
    }*/
}

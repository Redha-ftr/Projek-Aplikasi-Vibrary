/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EED
 */
public class Peminjaman {
    private String idPinjam;
    private String idAnggota;
    private String idBuku;
    private String idPetugas;
    private String tglPinjam;
    private String tglKembali;
    private String status;
    private int terlambat;
    private double denda;

    public String getIdPinjam() {
        return idPinjam;
    }

    public void setIdPinjam(String idPinjam) {
        this.idPinjam = idPinjam;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglpinjam) {
        this.tglPinjam = tglpinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglkembali) {
        this.tglKembali = tglkembali;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.learnmigratedb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "keterangan_penjualan")
@NamedQueries({
    @NamedQuery(name = "KeteranganPenjualan.findAll", query = "SELECT k FROM KeteranganPenjualan k"),
    @NamedQuery(name = "KeteranganPenjualan.findByIdNota", query = "SELECT k FROM KeteranganPenjualan k WHERE k.idNota = :idNota"),
    @NamedQuery(name = "KeteranganPenjualan.findByHarga", query = "SELECT k FROM KeteranganPenjualan k WHERE k.harga = :harga"),
    @NamedQuery(name = "KeteranganPenjualan.findByJumlahBarang", query = "SELECT k FROM KeteranganPenjualan k WHERE k.jumlahBarang = :jumlahBarang"),
    @NamedQuery(name = "KeteranganPenjualan.findByIdBarang", query = "SELECT k FROM KeteranganPenjualan k WHERE k.idBarang = :idBarang")})
public class KeteranganPenjualan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_nota")
    private String idNota;
    @Column(name = "harga")
    private Integer harga;
    @Column(name = "jumlah_barang")
    private String jumlahBarang;
    @Column(name = "id_barang")
    private String idBarang;

    public KeteranganPenjualan() {
    }

    public KeteranganPenjualan(String idNota) {
        this.idNota = idNota;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public String getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(String jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNota != null ? idNota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KeteranganPenjualan)) {
            return false;
        }
        KeteranganPenjualan other = (KeteranganPenjualan) object;
        if ((this.idNota == null && other.idNota != null) || (this.idNota != null && !this.idNota.equals(other.idNota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.learnmigratedb.KeteranganPenjualan[ idNota=" + idNota + " ]";
    }
    
}

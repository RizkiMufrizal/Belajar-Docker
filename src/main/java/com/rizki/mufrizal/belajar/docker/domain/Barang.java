package com.rizki.mufrizal.belajar.docker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com> <https://RizkiMufrizal.github.io>
 * @Since 16 July 2016
 * @Time 22:03
 * @Project Belajar-Docker
 * @Package com.rizki.mufrizal.belajar.docker.domain
 * @File Barang
 */
@Entity
@Table(name = "tb_barang")
public class Barang implements Serializable {

    @Id
    @Column(name = "id_barang")
    private UUID idBarang;

    @Column(name = "nama_barang")
    private String namaBarang;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "jenis_barang")
    private JenisBarang jenisBarang;

    @Column(name = "harga_barang")
    private BigDecimal hargaBarang;

    public UUID getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(UUID idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public JenisBarang getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(JenisBarang jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public BigDecimal getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(BigDecimal hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
}

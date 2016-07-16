package com.rizki.mufrizal.belajar.docker.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
@Document(collection = "tb_barang")
public class Barang implements Serializable {

    @Id
    @Field(value = "id_barang")
    private UUID idBarang;

    @Field(value = "nama_barang")
    private String namaBarang;

    @Field(value = "jenis_barang")
    private JenisBarang jenisBarang;

    @Field(value = "harga_barang")
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

/**
 * Barang.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/documentation/concepts/models-and-orm/models
 */

module.exports = {
  attributes: {
    idBarang: {
      type: 'integer',
      required: true,
      primaryKey: true,
      autoIncrement: true,
      columnName: 'id_barang'
    },
    namaBarang: {
      type: 'string',
      required: true,
      size: 50,
      columnName: 'nama_barang'
    },
    jenisBarang: {
      type: 'string',
      enum: ['cair', 'gas', 'padat'],
      required: true,
      columnName: 'jenis_barang'
    },
    hargaBarang: {
      type: 'integer',
      required: true,
      columnName: 'harga_barang'
    },
    tanggalKadaluarsa: {
      type: 'date',
      required: true,
      columnName: 'tanggal_kadaluarsa'
    }
  }
};

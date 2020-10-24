/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No3;

public class Ibu {

    // Attributes
    private int idIbu;
    private String namaIbu;
    private int umurIbu;

    // Constructor
    public Ibu(int idIbu, String namaIbu, int umurIbu) {
        this.idIbu = idIbu;
        this.namaIbu = namaIbu;
        this.umurIbu = umurIbu;
    }

    // Returns the ID of the mother
    public int getIdIbu() {
        return idIbu;
    }

    // Returns the name of the mother
    public String getNamaIbu() {
        return namaIbu;
    }

    // Returns the age of the mother
    public int getUmurIbu() {
        return umurIbu;
    }
}

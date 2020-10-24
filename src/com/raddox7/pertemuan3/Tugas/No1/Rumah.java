/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No1;

public class Rumah {

    // Attributes
    private String idRumah;
    private String pemilikRumah;
    private int jumlahOrang;

    // Constructor
    public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }

    // Returns the ID of the house
    public String getIdRumah() {
        return idRumah;
    }

    // Returns the name of the head of the household
    public String getPemilikRumah() {
        return pemilikRumah;
    }

    // Returns the number of people living in the house
    public int getJumlahOrang() {
        return jumlahOrang;
    }
}

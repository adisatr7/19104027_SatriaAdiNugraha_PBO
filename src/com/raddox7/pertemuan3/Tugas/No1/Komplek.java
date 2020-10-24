/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No1;

public class Komplek {

    // Define attributes
    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah = 0;
    private String[] idRumah = new String[30];

    // Constructor
    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    // Adds a house to this complex
    public void addRumah(String idRumah) {
        this.idRumah[jmlRumah] = idRumah;
        jmlRumah++;
    }

    // Prints out all data
    public void getDataKomplek() {
        System.out.println("Komplek Perumahan " + getNamaKomplek() + " " + getIdKomplek());
        System.out.println("Daftar Rumah:");
        for (int i = 0; i < jmlRumah; i++)
            System.out.println((i + 1) + ") " + idRumah[i]);
    }

    // Returns the neighborhood ID
    public String getIdKomplek() {
        return idKomplek;
    }

    // Sets the neighborhood ID
    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }

    // Returns the name of the neighborhood
    public String getNamaKomplek() {
        return namaKomplek;
    }

    // Sets the name of the neighborhood
    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    // Returns the number of total occupied houses
    public int getJmlRumah() {
        return jmlRumah;
    }

    // Overrides the variable that stores the number of occupied houses
    public void setJmlRumah(int jmlRumah) {
        this.jmlRumah = jmlRumah;
    }

    // Returns the house array
    public String[] getIdRumah() {
        return idRumah;
    }

    // Sets the house array
    public void setIdRumah(String[] idRumah) {
        this.idRumah = idRumah;
    }
}

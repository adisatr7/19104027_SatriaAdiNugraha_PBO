/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan3.Tugas.No3;

import java.util.ArrayList;
import java.util.List;

public class Keluarga {

    // Components
    private List<Anak> anakList = new ArrayList<>();
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    // Constructor
    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    // Returns family name
    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    // Returns origin location
    public String getKotaAsal() {
        return kotaAsal;
    }

    // Adds people into the family
    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, List<Anak> anakList) {
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anakList;
    }

    // Returns list of children
    public List<Anak> getAnakList() {
        return anakList;
    }

    // Returns father object
    public Ayah getAyah() {
        return ayah;
    }

    // Returns mother object
    public Ibu getIbu() {
        return ibu;
    }

    // Prints out the complete list of all family members
    public void getDataKeluarga() {
        System.out.println("Anggota Keluarga " + getNamaKeluarga());
        System.out.println("Asal\t: " + getKotaAsal());
        System.out.println("Ayah\t: " + getAyah().getNamaAyah());
        System.out.println("Ibu\t\t: " + getIbu().getNamaIbu());
        System.out.println("List Anak:");
        for (Anak anak : anakList)
            System.out.println("\t- " + anak.getNamaAnak());
    }
}

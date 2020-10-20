/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Tugas.No1;

public class Club {
    public String nama = "Tanpa Nama";
    public int tahunBerdiri = -1;
    public String stadion = "[Kosong]";
    public int juaraUcl = -1;
    public String deskripsi = "[Kosong]";

    public Club() {}

    public Club(String nama) {
        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        System.out.println("== Data Club ==");
        System.out.println("Nama: " + nama);
        if(tahunBerdiri != -1)
            System.out.println("Tahun berdiri: " + tahunBerdiri);
        if(!stadion.equals("[Kosong]"))
            System.out.println("Stadion: " + stadion);
        if(juaraUcl != -1)
            System.out.println("Juara: " + juaraUcl);
        if(!deskripsi.equals("[Kosong]"))
            System.out.println("Deskripsi: " + deskripsi);
        System.out.println();
    }
}

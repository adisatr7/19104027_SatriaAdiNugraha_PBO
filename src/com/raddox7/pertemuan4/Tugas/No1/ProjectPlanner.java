/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Tugas.No1;

public class ProjectPlanner extends Employee {
    String nama, nip;
    long gajiPokok, komisi, totalHasilProyek;

    public ProjectPlanner(String nama, String nip, long gajiPokok, long komisi, long totalHasilProyek) {
        super("Project Planner");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }

    public long hitungGaji() {
        double temppajak = gajiPokok * 0.05;
        long pajak = (long) temppajak;
        return gajiPokok + (komisi * totalHasilProyek) - pajak;
    }

    public void getData() {
        System.out.println("Nama\t: " + nama);
        System.out.println("NIP\t\t: " + nip);
        System.out.println("Jabatan\t: " + super.posisi);
        System.out.println("Gaji\t: Rp " + hitungGaji());
    }
}

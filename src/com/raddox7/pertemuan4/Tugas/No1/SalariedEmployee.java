/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Tugas.No1;

public class SalariedEmployee extends Employee {
    String nama, nip;
    long upahMingguan;

    public SalariedEmployee(String nama, String nip, long upahMingguan) {
        super("Salaried Employee");
        this.nama = nama;
        this.nip = nip;
        this.upahMingguan = upahMingguan;
    }

    public long hitungGaji() {
        return upahMingguan;
    }

    public void getData() {
        System.out.println("Nama\t: " + nama);
        System.out.println("NIP\t\t: " + nip);
        System.out.println("Jabatan\t: " + super.posisi);
        System.out.println("Gaji\t: Rp " + hitungGaji());
    }
}

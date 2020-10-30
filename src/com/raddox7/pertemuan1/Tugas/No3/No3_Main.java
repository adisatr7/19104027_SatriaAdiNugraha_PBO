/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Tugas.No3;

import java.util.Scanner;

public class No3_Main {
    private static String nama;
    private static String posisi;
    private static int usia;
    Scanner input = new Scanner(System.in);

    private static void print() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + posisi);
        System.out.println("Usia: " + usia);
    }

    public static void main(String[] args) {
        nama = "Johnny Gat";
        posisi = "Manager";
        usia = 37;

        System.out.println("Data Karyawan #1");
        print();
    }
}

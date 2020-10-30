/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan2.Tugas.No1;

public class No1_Main {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club(
                "VLDV Motorcycle Club");
        Club club3 = new Club(
                "TSM.Play",
                "Stronkman onli");
        Club club4 = new Club(
                "SSG Club",
                2019,
                "SSG Stadium");
        Club club5 = new Club(
                "EGG",
                2015,
                "Greece Champions Arena",
                3,
                "Experience is power");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}

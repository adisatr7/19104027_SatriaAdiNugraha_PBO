/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan4.Tugas.No1;

public class No1_Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee(
                        "Eliza",
                        "199607072020072001",
                        3_000_000),
                new CommissionEmployee(
                        "Jensen",
                        "198001052027011002",
                        16_000_000,
                        600_000,
                        9),
                new ProjectPlanner(
                        "Sera",
                        "198905022010022003",
                        24_000_000,
                        800_000,
                        7
                )
        };

        for (Employee employee : employees) {
            employee.getData();
            System.out.println();
        }
    }
}

/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Praktikum.Method;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        TestPass pass = new TestPass(50, 100);
        nomer1 = 10;
        nomer2 = 20;

        //Passed by value
        System.out.println("Nilai sebelum 'passed by value'");
        System.out.println("nomer1 = " + nomer1);
        System.out.println("nomer2 = " + nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai setelah 'passed by value'");
        System.out.println("nomer1 = " + nomer1);
        System.out.println("nomer2 = " + nomer2);

        //Passed by reference
        System.out.println("Nilai sebelum 'passed by reference'");
        System.out.println("pass,nomer1 = " + pass.nomer1);
        System.out.println("pass.nomer2 = " + pass.nomer2);

        pass.calculate(pass);
        System.out.println("Nilai setelah 'passed by reference'");
        System.out.println("pass,nomer1 = " + pass.nomer1);
        System.out.println("pass.nomer2 = " + pass.nomer2);
    }
}

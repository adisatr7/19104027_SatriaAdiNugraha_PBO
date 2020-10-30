/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */

package com.raddox7.pertemuan1.Praktikum.Method;

public class TestPass {
    int nomer1;
    int nomer2;

    //Constructor
    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    //Method
    //Pass by value (parameter: primitive data type)
    public void calculate(int m, int n) {
        m = n * 10;
        n = n / 2;
    }

    //Pass by reference (parameter: class data type)
    public void calculate(TestPass pass) {
        pass.nomer1 = pass.nomer1 * 10;
        pass.nomer2 = pass.nomer2 / 2;
    }
}

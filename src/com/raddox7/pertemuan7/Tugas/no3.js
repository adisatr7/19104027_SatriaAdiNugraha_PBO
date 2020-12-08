/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Mencari nilai max
function getMax(a) {
    return Math.max.apply(Math, a)
}

// Mencari nilai min
function getMin(a) {
    return Math.min.apply(Math, a)
}


// Deklarasi nilai yang akan dicek
var nilai = [5, 6, 2, 3, 7];

// Output
console.log("Nilai: " + nilai.join(", "));
console.log("Nilai maksimum: " + getMax(nilai));
console.log("Nilai minimum: " + getMin(nilai));
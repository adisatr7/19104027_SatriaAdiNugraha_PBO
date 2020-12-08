/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Fungsi mencari rata-rata
function getAvg(nilai) {
    var sum = 0;
    for(var i=0; i<nilai.length; i++)
        sum += nilai[i];
    return sum / nilai.length;
}


// Input Simulator™
var input1 = "Indah Pertiwi";
var input2 = [67, 70, 100, 95, 80, 55, 77, 100, 80, 91];


// Inputan user (via Input Simulator™)
console.log("Masukan nama:", input1);

// Output rata-rata
console.log("Nilai rata-rata kamu:", getAvg(input2));
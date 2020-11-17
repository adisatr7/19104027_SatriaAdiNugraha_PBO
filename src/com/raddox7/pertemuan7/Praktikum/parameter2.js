/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Membuat fungsi tanpa parameter / argumen
function sum() {
    var result = 0,
        i = 0,
        len = arguments.length;

    // Melakukan loop sebanyak yang diminta di argumen
    while(i < len) {
        result += arguments[i];
        i++;
    }

    return result;
}

// Output
console.log(sum(1,4));
console.log(sum(3,5,2,7));
console.log(sum());
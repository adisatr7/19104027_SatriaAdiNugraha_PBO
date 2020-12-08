/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Membuat fungsi dengan 1 parameter
function reflect(value) {
    return value;
}

// Menampilkan fungsi
console.log(reflect("Halo!"));
console.log(reflect("Hari ini hari ke", 2));
console.log("Panjang argument:", reflect.length);

// Meredefinisikan fungsi reflect()
reflect = function() {
    return arguments[1];
};

// Menampilkan fungsi
console.log(reflect("Halo!"));
console.log(reflect("Hari ini hari ke", 2));
console.log("Panjang argument:", reflect.length);
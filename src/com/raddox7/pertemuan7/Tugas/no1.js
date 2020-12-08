/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Fungsi mencari predikat
function getPredikat(nilai) {
    if(100 >= nilai && nilai >= 85)
        return "'A'";
    else if(85 > nilai && nilai >= 75)
        return "'B'";
    else if(75 > nilai && nilai >= 65)
        return "'BC'";
    else if(65 > nilai && nilai >= 55)
        return "'C'";
    else if(55 > nilai && nilai >= 45)
        return "'D'";
    else if(45 > nilai && nilai >= 0)
        return "'E'";
    else
        return "Ngawur!";
}


// Inisiasi readline untuk memproses inputan user
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});


// Menanyakan nama user
readline.question("Masukan nama: ", (name) => {

    // Menanyakan nilai user
    readline.question("Masukan nilai: ", (nilai) => {

        // Mencetak predikat user dengan memanggil getPredikat()
        console.log(name + ", kamu mendapat predikat " + getPredikat(nilai));

        // Terminate program
        process.exit(0)
    });
});
/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Kelas Mahasiswa
function Mahasiswa(nim, nama, prodi) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;

    // Method untuk menampilkan data
    this.tampil = function() {
        console.log(`- NIM   : ${this.nim}`);
        console.log(`- Nama  : ${this.nama}`);
        console.log(`- Prodi : ${this.prodi}`)
    }
}


// Inisiasi prompt
const prompt = require('prompt-sync')();

// Menanyakan banyaknya obyek yang ingin dibuat
const jmlMhs = Number(prompt("Masukan jumlah mahasiswa: "));
console.log();

// Array penampung obyek mahasiswa
let arrayMahasiswa = [];

// Obyek Mahasiswa
let mhs = {};

// Pembuatan obyek mahasiswa sekaligus masukan ke array
for(let i=0; i<jmlMhs; i++) {
    console.log(`\nMahasiswa ke-${i+1}`);
    mhs = new Mahasiswa(
        prompt("Masukan NIM   : "),
        prompt("Masukan Nama  : "),
        prompt("Masukan Prodi : ")
    );

    arrayMahasiswa.push(mhs);
    console.log()
}

// Menanyakan apakah user ingin mengedit data
let isEdit = (prompt("Ingin edit data? (Y/N): ").toLowerCase() === 'y');
console.log();

// Fase edit-mengedit
while(isEdit) {

    // User ditanya ingin mengedit data mahasiswa urutan berapa
    let noMhs;
    do {
        noMhs = Number(prompt("Masukan urutan mahasiswa yang ingin diubah: ")) -1;
        console.log();

        /*  Akan keluar looping jika:
            - noMhs merupakan angka
            - noMhs nilainya antara 0 sampai besarnya 'jmlMhs'
         */
        if(Number.isFinite(noMhs) && noMhs >= 0 && noMhs < jmlMhs)
            break;
        else
            console.log("Error: Tolong masukan angka yang benar!\n");
    }while(true);

    // Proses pengeditan data mahasiswa
    Mahasiswa.prototype.edit = function() {
        const nim = prompt("Masukan NIM   : ");
        const nama = prompt("Masukan Nama  : ");
        const prodi = prompt("Masukan Prodi : ");
        const tampil = this.tampil;

        console.log();
        return {nim, nama, prodi, tampil}
    };

    arrayMahasiswa[noMhs] = arrayMahasiswa[noMhs].edit();
    console.log("Data berhasil diubah!");

    console.log();
    isEdit = (prompt("Ingin edit data lagi? (Y/N): ").toLowerCase() === 'y');
}

// Menampilkan data semua mahasiswa
for(let i=0; i<jmlMhs; i++) {
    console.log();
    console.log(`Mahasiswa ke-${i+1}`);
    arrayMahasiswa[i].tampil()
}
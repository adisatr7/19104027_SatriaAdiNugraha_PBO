/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Constructor Buku
function Buku(judul, pengarang, penerbit, thnTerbit) {
    this.judul = judul;
    this.pengarang = pengarang;
    this.penerbit = penerbit;
    this.thnTerbit = thnTerbit;

    this.tampil = function() {
        console.log(`- Judul buku     : ${this.judul}`);
        console.log(`- Nama pengarang : ${this.pengarang}`);
        console.log(`- Penerbit       : ${this.penerbit}`);
        console.log(`- Tahun terbit   : ${this.thnTerbit}`)
    }
}


// Inisiasi prompt
const prompt = require('prompt-sync')();

// Menentukan jumlah buku
const jmlBuku = prompt("Jumlah buku yang akan dibuat: ");

// Array menampung obyek-obyek buku
let arrayBuku = [];

// Membuat obyek buku sebanyak 'jmlBuku'
for(let i=0; i<jmlBuku; i++) {
    console.log();
    arrayBuku.push(
        new Buku(
            prompt(`Masukan judul buku ke-${i+1} : `),
            prompt(`Masukan nama pengarang  : `),
            prompt(`Masukan nama penerbit   : `),
            prompt(`Masukan tahun terbit    : `)
        )
    )
}
console.log();

// Menanyakan apakah user ingin mengedit data
let isEdit = (prompt("Ingin edit data? (Y/N): ").toLowerCase() === 'y');
console.log();

// Fase edit-mengedit
while(isEdit) {

    let noBuku;
    do {
        // User ditanya ingin mengubah buku urutan berapa
        noBuku = Number(prompt("Masukan urutan buku yang ingin diubah: ")) -1;
        console.log();

        /*  Akan keluar looping jika:
            - noBuku merupakan angka
            - noBuku nilainya antara 0 sampai besarnya 'jmlBuku'
         */
        if(Number.isFinite(noBuku) && noBuku >= 0 ** noBuku < jmlBuku)
            break;
        else
            console.log("Error: Tolong masukan angka yang benar!\n")
    }while(true);

    let edit;
    do{
        // User ditanya ingin mengedit apa
        console.log("Data apa yang ingin diubah?");
        console.log("1. Judul");
        console.log("2. Pengarang");
        console.log("3. Penerbit");
        console.log("4. Tahun Terbit");
        console.log();

        edit = Number(prompt("> "));
        console.log();

        // Hanya akan keluar loop jika nilai 'edit' adalah angka
        if(Number.isFinite(edit))
            break;
        else
            console.log("Error: Tolong hanya masukan angka saja!\n")
    }while(true);


    switch(edit) {
        case 1:     // Edit Judul
            arrayBuku[noBuku].judul = prompt("Masukan judul buku: ");
            break;
        case 2:     // Edit Pengarang
            arrayBuku[noBuku].pengarang = prompt("Masukan nama pengarang: ");
            break;
        case 3:     // Edit Penerbit
            arrayBuku[noBuku].penerbit = prompt("Masukan nama penerbit: ");
            break;
        case 4:     // Edit Tahun Terbit
            arrayBuku[noBuku].thnTerbit = prompt("Masukan tahun terbit: ");
            break;
        default:    // Jika user menginput yang aneh-aneh
            console.log("Error: Tolong masukan yang benar!");
            break;
    }
    console.log();
    isEdit = (prompt("Ingin edit data lagi? (Y/N): ").toLowerCase() === 'y');
}

// Menampilkan data semua buku
for(let i=0; i<jmlBuku; i++) {
    console.log();
    console.log(`Buku ke-${i+1}`);
    arrayBuku[i].tampil()
}
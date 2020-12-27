/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Parent object: Pegawai
let Pegawai = {
    inputData: function(nip, nama, alamat, gajiPokok) {
        this.nip = prompt("Masukan NIP: ");
            this.nama = prompt("Masukan nama: ");
            this.alamat = prompt("Masukan alamat: ");
            this.gajiPokok = prompt("Masukan gaji pokok: ")
    },

    inputTunjangan: function(tunjangan) {
        this.tunjangan = prompt("Masukan tunjangan: ")
    },

    print: function() {
        console.log(`- NIP        : ${this.nip}`);
        console.log(`- Nama       : ${this.nama}`);
        console.log(`- Alamat     : ${this.alamat}`);
        console.log(`- Gaji pokok : ${this.gajiPokok}`);
        console.log(`- Tunjangan  : ${this.tunjangan}`);
        console.log(`- TOtal gaji : ${this.gajiPokok + this.tunjangan}`)
    }
};

// Child object: Sales
let Sales = Object.create(Pegawai);
Sales.inputTunjangan = function() {
    jmlPelanggan = prompt("Masukan jumlah pelanggan yang direkrut: ");
    this.tunjangan = jmlPelanggan * 50000
};

// Child object: Satpam
let Satpam = Object.create(Pegawai);
Satpam.inputTunjangan = function(tunjangan) {
    jam = prompt("Masukan jumlah lembur (dalam jam): ");
    this.tunjangan = jam * 10000
};

// Child object: Manager
let Manager = Object.create(Pegawai);
Manager.inputTunjangan = function(tunjangan) {
    thMasuk = prompt("Masukan tahun masuk: ");
    lamaKerja = 2020 - thMasuk;
    if(lamaKerja <= 3)
        this.tunjangan = 5 / 100 * this.gajiPokok;
    else
        this.tunjangan = 10 / 100 * this.gajiPokok
};


const prompt = require('prompt-sync')();


console.log("Data pegawai PT ABC \n1. Satpam");
Satpam.inputData();
Satpam.inputTunjangan();

console.log("\n2. Sales");
Sales.inputData();
Sales.inputTunjangan();

console.log('\n3. Manager');
Manager.inputData();
Manager.inputTunjangan();

console.log("\n----------Hasil Input Data Pegawai----------");
console.log("\n1. Data Satpam");
Satpam.print();

console.log("\n2. Data Sales");
Sales.print();

console.log("\n3. Data Manager");
Manager.print();
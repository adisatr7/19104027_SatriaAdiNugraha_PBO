/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Class: Kendaraan
let Kendaraan = {
    inputAtribut() {
        this.noPlat = prompt("Masukan plat nomor            : ").toUpperCase();
        this.merk = prompt("Masukan merk kendaraan        : ");
        this.pajak = Number(prompt ("Masukan pajak kendaraan       : "))
    },

    print() {
        console.log(`- Nomor Kendaraan        : ${this.noPlat}`);
        console.log(`- Merk                   : ${this.merk}`);
        this.printFasTambahan();
        console.log(`- Pajak Kendaraan        : ${this.pajak}`);
        console.log(`- Total Pembayaran Pajak : ${this.hitungPajak()}`);
        console.log('')
    },

    fasTambahan() {},
    printFasTambahan() {},
    hitungPajak() {}
};


// Sub-class: Sedan
let Sedan = Object.create(Kendaraan);
Sedan.fasTambahan = function() {
    this.fasKeamanan = prompt("Masukan fasilitas keamanan    : ");
    this.kapasitasCC = Number(prompt("Masukan kapasitas (dalam CC)  : "));
    this.fasKenyamanan = prompt("Masukan fasilitas kenyamanan  : ");
};

Sedan.printFasTambahan = function() {
    console.log(`- Fasilitas keamanan     : ${this.fasKeamanan}`);
    console.log(`- Kapasitas (CC)         : ${this.kapasitasCC}`);
    console.log(`- Fasilitas kenyamanan   : ${this.fasKenyamanan}`)
};

Sedan.hitungPajak = function() {
    return this.pajak + (this.pajak * this.kapasitasCC * 0.00005)
};


// Sub-class: Bus
let Bus = Object.create(Kendaraan);
Bus.fasTambahan = function() {
    this.kapPenumpang = Number(prompt("Masukan kapasitas penumpang   : "));
    this.kapBagasi = Number(prompt("Masukan kapasitas bagasi (kg) : "))
};

Bus.printFasTambahan = function() {
    console.log(`- Kapasitas penumpang    : ${this.kapPenumpang}`);
    console.log(`- Kapasitas bagasi (kg)  : ${this.kapBagasi}`)
};

Bus.hitungPajak = function() {
    return this.pajak + (this.pajak * this.kapPenumpang * this.kapBagasi * 0.00005)
};


const prompt = require('prompt-sync')();

console.log("=== Input Data Sedan ===");
Sedan.inputAtribut();
Sedan.fasTambahan();

console.log('');

console.log("=== Input Data Bus ===");
Bus.inputAtribut();
Bus.fasTambahan();

console.log('');

console.log("=== Data Seluruh Kendaraan ===");
console.log("1. Sedan");
Sedan.print();

console.log("2. Bus");
Bus.print();
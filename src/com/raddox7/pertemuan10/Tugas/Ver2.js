/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Class: Kendaraan
function Kendaraan(noPlat, merk, pajak) {
    this.noPlat = String(noPlat).toUpperCase();
    this.merk = merk;
    this.pajak = Number(pajak)
}

Kendaraan.prototype.print = function() {
    console.log(`- Nomor Kendaraan        : ${this.noPlat}`);
    console.log(`- Merk                   : ${this.merk}`);
    this.printFasTambahan();
    console.log(`- Pajak Kendaraan        : ${this.pajak}`);
    console.log(`- Total Pembayaran Pajak : ${this.hitungPajak()}`);
    console.log('')
};

Kendaraan.prototype.fasTambahan = function() {};
Kendaraan.prototype.printFasTambahan = function() {};
Kendaraan.prototype.hitungPajak = function() {};


// Sub-class: Sedan
function Sedan(noPlat, merk, pajak) {
    Kendaraan.call(this, noPlat, merk, pajak)
}
Sedan.prototype = new Kendaraan();

Sedan.prototype.fasTambahan = function() {
    this.fasKeamanan = prompt("Masukan fasilitas keamanan    : ");
    this.kapasitasCC = Number(prompt("Masukan kapasitas (dalam CC)  : "));
    this.fasKenyamanan = prompt("Masukan fasilitas kenyamanan  : ");
};

Sedan.prototype.printFasTambahan = function() {
    console.log(`- Fasilitas keamanan     : ${this.fasKeamanan}`);
    console.log(`- Kapasitas (CC)         : ${this.kapasitasCC}`);
    console.log(`- Fasilitas kenyamanan   : ${this.fasKenyamanan}`)
};

Sedan.prototype.hitungPajak = function() {
    return this.pajak + (this.pajak * this.kapasitasCC * 0.00005)
};


// Sub-class: Bus
function Bus(noPlat, merk, pajak) {
    Kendaraan.call(this, noPlat, merk, pajak)
}
Bus.prototype = new Kendaraan();

Bus.prototype.fasTambahan = function() {
    this.kapPenumpang = Number(prompt("Masukan kapasitas penumpang   : "));
    this.kapBagasi = Number(prompt("Masukan kapasitas bagasi (kg) : "))
};

Bus.prototype.printFasTambahan = function() {
    console.log(`- Kapasitas penumpang    : ${this.kapPenumpang}`);
    console.log(`- Kapasitas bagasi (kg)  : ${this.kapBagasi}`)
};

Bus.prototype.hitungPajak = function() {
    return this.pajak + (this.pajak * this.kapPenumpang * this.kapBagasi * 0.00005)
};


const prompt = require('prompt-sync')();

console.log("=== Input Data Sedan ===");
const sedan = new Sedan(
    prompt("Masukan plat nomor            : "),
    prompt("Masukan merk kendaraan        : "),
    prompt("Masukan pajak kendaraan       : ")
);
sedan.fasTambahan();

console.log('');

console.log("=== Input Data Bus ===");
const bus = new Bus(
    prompt("Masukan plat nomor            : "),
    prompt("Masukan merk kendaraan        : "),
    prompt("Masukan pajak kendaraan       : ")
);
bus.fasTambahan();

console.log('');

console.log("=== Data Seluruh Kendaraan ===");
console.log("1. Sedan");
sedan.print();

console.log("2. Bus");
bus.print();

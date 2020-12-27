/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Constructor persegi panjang
function PersegiPanjang(panjang, lebar) {
    this.panjang = panjang;
    this.lebar = lebar
}

PersegiPanjang.prototype.getLuas = function() {
    const luas = this.panjang * this.lebar;
    console.log(`Luas = ${this.panjang} x ${this.lebar}`);
    console.log(`     = ${luas}`)
};

PersegiPanjang.prototype.print = function() {
    console.log(`Panjang sisi : ${this.panjang}`);
    console.log(`Lebar sisi   : ${this.lebar}`)
};


// Mewarisi properti PersegiPanjang
function Persegi(sisi) {
    this.panjang = sisi;
    this.lebar = sisi;
}

Persegi.prototype = new PersegiPanjang();
Persegi.prototype.constructor = PersegiPanjang;

Persegi.prototype.print = function() {
    console.log(`Panjang sisi: ${this.panjang}`)
};


const prompt = require('prompt-sync')();

console.log("Persegi Panjang");
let obPersegiPanjang = new PersegiPanjang(
    prompt("Masukan panjang : "),
    prompt("Masukan lebar   :")
);

console.log("\nPersegi");
let obPersegi = new Persegi(
    prompt("Masukan panjang sisi: ")
);

console.log("Menghitung luas persegi panjang...");
obPersegiPanjang.print();
obPersegiPanjang.getLuas();

console.log("\nMenghitung luas persegi...");

obPersegi.print();
obPersegi.getLuas();
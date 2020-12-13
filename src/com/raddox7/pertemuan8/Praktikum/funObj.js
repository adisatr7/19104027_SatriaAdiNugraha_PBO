/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-03-A
 *  NIM  : 19104027
 */


const prompt = require("prompt-sync")();


console.log("Berapa mahasiswa?");
let total = prompt("> ");

var array = [];

for(let i=0; i<total; i++) {
    console.log(`\nMahasiswa ke-${i+1}`);

    let name = prompt("Masukan nama: ");
    let nim = prompt("Masukan NIM: ");
    let birth = prompt("Masukan tanggal lahir: ");

    let mahasiswa = new Mahasiswa(name, nim, birth);
    array.push(mahasiswa)
}

let index = 0;

for(let x in array) {
    console.log();
    index++;
    console.log(`Mahasiswa ke-${index}`);
    console.log(`- Nama: ${array[x].nama}`);
    console.log(`- Tanggal lahir: ${array[x].birth}`);
    console.log(`- NIM: ${array[x].nim}`);
    console.log(`- Umur: ${array[x].age()}`);
    console.log()
}

function Mahasiswa(name, nim, birth) {
    this.name = name;
    this.nim = nim;
    this.birth = birth;

    this.age = function() {
        let year = this.birth.slice(this.birth.length - 4);
        return 2020 - year
    }
}
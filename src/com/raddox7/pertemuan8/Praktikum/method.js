/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-03-A
 *  NIM  : 19104027
 */


const prompt = require('prompt-sync')();


console.log("Berapa mahasiswa?");
let total = prompt("> ");

let array = [];
let mahasiswa = {};

for(let i = 0; i < total; i++) {
    console.log(`\nMahasiswa ${i+1}`);
    mahasiswa = new Object({
        name: prompt("Masukan nama: "),
        birth: prompt("Masukan tanggal lahir: "),
        nim: prompt("Masukan NIM: "),

        age: function() {
            let year = this.birth.slice(this.birth.length -4);
            return 2020 - year
        }
    });

    array.push(mahasiswa)
}


let index = 0;

for(let x in array) {
    console.log()
    index++;
    console.log(`Mahasiswa ke-${index}`);
    console.log(`- Nama: ${array[x].name}`);
    console.log(`- Tanggal lahir: ${array[x].birth}`);
    console.log(`- NIM: ${array[x].nim}`);
    console.log(`- Umur: ${array[x].age()}`)
    console.log()
}
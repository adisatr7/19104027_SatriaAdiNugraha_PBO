/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-03-A
 *  NIM  : 19104027
 */


const prompt = require('prompt-sync')();

let object = {};
object.name = prompt(`Input name: `);
object.age = prompt(`Input age: `);
object.nim = prompt(`Input NIM: `);
object.prodi = prompt(`Input Program Studi: `);

console.log();

// Mencetak value di masaing-masing property milik object
console.log(object);

// Mencetak properti-properti di object
for(var property in object){
    console.log(property)
}
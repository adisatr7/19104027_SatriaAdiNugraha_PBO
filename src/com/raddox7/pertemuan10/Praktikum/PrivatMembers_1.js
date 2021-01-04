/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


function Person(name) {
    let age = 20;   // Definisi private variable

    this.name = name;

    this.getAge = function() {
        return age
    };

    this.growOlder = function() {
        age++
    };
}


const person = new Person("Jean");

console.log(`Nama person: ${person.name}`);
console.log(`Umur person: ${person.getAge()}`);

// Mengganti umur
person.age = 100;
console.log(`Umur person yang diganti : ${person.getAge()}`);

person.growOlder();
console.log(`Umur person yang ditambah: ${person.getAge()}`);
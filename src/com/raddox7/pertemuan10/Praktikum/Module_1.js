/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


const person = (function () {
    let age = 25;

    return {
        name: "Paimon",

        getAge: function () {
            return age
        },

        growOlder: function () {
            age++
        }
    }
}());

console.log(`Nama person: ${person.name}`);
console.log(`Umur person: ${person.getAge()}`);

// Mengganti umur
person.age = 100;
console.log(`Umur person yang diganti : ${person.getAge()}`);

person.growOlder();
console.log(`Umur person yang ditambah: ${person.getAge()}`);
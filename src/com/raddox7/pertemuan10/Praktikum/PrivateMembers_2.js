/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


const Person = (function () {
    let age = 25;

    function InnerPerson(name) {
        this.name = name
    }

    InnerPerson.prototype.getAge = function () {
        return age
    };

    InnerPerson.prototype.growOlder = function () {
        age++
    };

    return InnerPerson
}());


console.log(`Nama person: ${person.name}`);
console.log(`Umur person: ${person.getAge()}`);

// Mengganti umur
person.age = 100;
console.log(`Umur person yang diganti: ${person.getAge()}`);

person.growOlder();
console.log(`Umur person yang ditambah: ${person.getAge()}`);
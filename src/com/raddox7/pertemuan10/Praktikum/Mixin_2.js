/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Function penggabungan 2 object dan jika beberapa properti yang diambil
function mixin(receiver, supplier) {
    if(arguments.length > 2) {
        for(let i=2, len=arguments.length; i<len; i++) {
            if(!receiver.hasOwnProperty(arguments[i])) {
                receiver[arguments[i]] = supplier[arguments[i]]
            }
        }
    }

    else {
        for(let property in supplier) {
            if(supplier.hasOwnProperty(property)) {
                receiver[property] = supplier[property]
            }
        }
    }

    return receiver
}

// Module pattern
const Person = (function () {
    let name = 'Chara';
    let age = 25;

    function setName(newName) {
        name = newName
    }

    function getName() {
        return name
    }

    function getAge() {
        return age;
    }

    return {
        setName: setName,
        getName: getName,
        getAge: getAge
    }
}());


person.setName('Jean');
const title = new Title('Grand Master');

// Penggabungan 2 object dan tambahan property hanya yang akan diambil
mixin(person, title, 'title');

console.log(`Nama    : ${person.getName()}`);
console.log(`Age     : ${person.getAge}`);
console.log(`Title   : ${person.title}`);
console.log(`Element : ${person.element}`);
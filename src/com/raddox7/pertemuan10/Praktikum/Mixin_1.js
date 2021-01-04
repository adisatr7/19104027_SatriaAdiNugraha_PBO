/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Function penggabungan 2 object
function mixin(receiver, supplier) {
    for(let proprety in supplier) {
        if(supplier.hasOwnProperty(proprety)) {
            receiver[proprety] = supplier[proprety]
        }
    }
    return receiver
}

// Module patern
const person = (function() {
    let name = 'Chara';
    let age = 25;

    function setName(newName) {
        name = newName
    }

    function getName() {
        return name
    }

    function getAge() {
        return age
    }

    return {
        setName: setName,
        getName: getName,
        getAge: getAge
    }
}());

// Private member
const Title = (function() {
    let element = 'Anamo';

    function InnerTitle(title) {
        this.title = title;
        this.element = element;
    }

    return InnerTitle
}());


person.setName('Jean');
const title = new Title('Grand Master');

// Penggabungan 2 object
mixin(person, title);

console.log(`Nama    : ${person.getName()}`);
console.log(`Age     : ${person.getAge()}`);
console.log(`Title   : ${person.title}`);
console.log(`Element : ${person.element}`);
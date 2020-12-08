/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


var person = {
    fullName: function(birth, city) {
        return this.firstName + " " + this.lastName + ", " + birth + ", " + city;
    }
};

var person1 = {
    firstName: "Ajeng",
    lastName: "Fitria"
};

person.fullName.apply(person1, ["Desember", "Cilacap"]);
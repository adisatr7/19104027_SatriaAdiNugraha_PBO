/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Contoh 1

function myFunction(a, b, c) {
    console.log("Hello, my name is", a);
    console.log("I'm", b, " years old");
    console.log("I like", c);
}

console.log("\nOutput contoh 1:");
myFunction("Ajeng Fitria", 19, "Singing");


// Contoh 2

function myFunction2(arg1, arg2) {
    this.firstName = arg1;
    this.lastName = arg2;
}

var x = new myFunction2("Bagus", "Bayu");

console.log("\nOutput contoh 2:");
x.firstName;
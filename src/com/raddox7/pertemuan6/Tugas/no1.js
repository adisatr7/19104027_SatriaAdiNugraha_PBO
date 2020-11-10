// Jumlah bilangan prima yang ingin dicetak
var n = 15;

// Array untuk menampung bilangan prima
var prime_numbers = [];

// Mulai pencarian bilangan prima
var number = 2;
do {
    var is_prime = true;
    for(var i=2; i<number; i++) {
        if(number % i === 0) {
            is_prime = false;
        }
    }
    if(is_prime)
        prime_numbers.push(number);
    number++;
} while(prime_numbers.length !== n);

// Output bilangan prima sebanyak 'n'
console.log("Bilangan prima\t: " + prime_numbers.join(", "));
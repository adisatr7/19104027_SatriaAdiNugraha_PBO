// Menentukan berapa banyak bilangan Fibonacci yang ingin di-outputkan program
var n = 11;

// Array untuk menampung hasil
var fibonacci_numbers = [0, 1];

// Mulai mencari
for(var i=0; i<n-2; i++) {
    fibonacci_numbers.push(fibonacci_numbers[i] + fibonacci_numbers[i+1]);
}

// Output hasil
console.log("Bilangan Fibonacci: " + fibonacci_numbers.join(", "));
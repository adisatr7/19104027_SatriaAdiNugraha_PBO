/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-03-A
 *  NIM  : 19104027
 */


// Untuk memproses input
const prompt = require('prompt-sync')();

// Untuk menampung obyek Mahasiswa
let listMahasiswa = [];


// 'Class' Mahasiswa
function Mahasiswa(nama, tgl_lahir, nim, prodi) {
    this.nama = nama;
    this.tgl_lahir = tgl_lahir;
    this.nim = nim;
    this.prodi = prodi;


    // Secara default nilai di-set ke -1 agar 'grade' = null
    this.nilai = -1;

    // Property 'grade' didapatkan melalui proses berikut:
    Object.defineProperty(this, "grade", {
        get() {
            if(80 <= this.nilai && this.nilai <= 100)
                return 'A';

            else if(60 <= this.nilai && this.nilai < 80)
                return 'B';

            else if(40 <= this.nilai && this.nilai < 60)
                return 'C';

            else if(0 <= this.nilai && this.nilai < 40)
                return 'D';

            else
                return null
        }
    });


    // Property 'umur' didapatkan melalui proses berikut:
    Object.defineProperty(this, "umur", {
        get() {
            return 2020 - (this.tgl_lahir.slice(this.tgl_lahir.length - 4))
        }
    });


    // Method mencetak data mahasiswa
    this.printData = function() {
        console.log(`- Nama          : ${this.nama}`);
        console.log(`- Tanggal lahir : ${this.tgl_lahir}`);
        console.log(`- Umur          : ${this.umur}`);
        console.log(`- NIM           : ${this.nim}`);
        console.log(`- Prodi         : ${this.prodi}`);
        console.log(`- Grade         : ${this.grade}`)
    }
}


// Semua yang berhubungan dengan menu program ditampung di sini
const Menu = {

    // Boolean sebagai syarat berhentinya looping menu utama program
    isExit: false,

    // Perintah untuk memulai menu utama program
    start() {

        // Do-While bertujuan agar program terus berjalan
        do {
            console.log();
            console.log("<===== Menu Penilaian =====>");
            console.log("1. Tambah Mahasiswa");
            console.log("2. Penilaian");
            console.log("3. Lihat Seluruh Mahasiswa");
            console.log("4. Keluar");
            console.log();

            let nav = prompt("> ");

            switch(nav) {
                case '1':   // Tambah Mahasiswa
                    Menu.add.mahasiswa();
                    break;

                case '2':   // Penilaian
                    Menu.add.nilai();
                    break;

                case '3':   // Lihat Seluruh Mahasiswa
                    Menu.show.mahasiswa();
                    break;

                case '4':   // Keluar
                    Menu.exit();
                    break;
            }
        }while(!Menu.isExit);
    },


    // Kumpulan method untuk memasukan data
    add: {

        // Menu untuk menambahkan mahasiswa
        mahasiswa() {
            console.log();
            console.log("<==== Tambah Mahasiswa ====>");
            const nama = prompt("Input nama         : ");
            const tgl_lahir = prompt("Input tanggal lahir: ");
            const nim = prompt("Input NIM          : ");

            Menu.process.inputDataMahasiswa(nama, tgl_lahir, nim)
        },


        // Menu penilaian
        nilai() {
            console.log("\n<==== Penilaian ====>");
            const nim = prompt("Input NIM: ");
            const nilai = Number(prompt("Set nilai: "));

            Menu.process.inputNilai(nim, nilai)
        }
    },


    // Kumpulan method untuk menampilkan data
    show: {

        // Menu untuk menampilkan data seluruh mahasiswa
        mahasiswa() {
            let counter = 1;
            for(let mahasiswa of listMahasiswa) {
                console.log();
                console.log(`Mahasiswa ke-${counter}`);
                mahasiswa.printData();
                console.log();
                counter++;
            }
        }
    },


    // Kumpulan proses-proses backend complex
    process: {

        // Proses pemilihan prodi
        selectProdi() {

            // Do-While di sini bertujuan untuk menghindari user menginput yang aneh-aneh
            do {
                // Menampilkan daftar prodi yang ada
                console.log("<= Pilih Prodi:");
                console.log("1. S1 SE");
                console.log("2. S1 IF");
                console.log("3. S1 SI");
                console.log();

                // User menginput prodi mahasiswa
                let p = Number(prompt("> "));

                // Jika user menginput dengan benar (program akan keluar loop)
                if(p === 1)
                    return "S1 SE";

                else if(p === 2)
                    return "S1 IF";

                else if(p === 3)
                    return "S1 SI";

                // Jika user menginput yang aneh-aneh (program akan terus loop)
                else
                    console.log("\nInput salah! Mohon masukan yang benar!\n")

            }while(true);
        },


        // Proses memasukan data mahasiswa ke program
        inputDataMahasiswa(nama, tgl_lahir, nim) {
            console.log();
            const prodi = Menu.process.selectProdi();

            console.log();
            listMahasiswa.push(new Mahasiswa(nama, tgl_lahir, nim, prodi))
        },


        // Proses backend memasukan nilai mahasiswa
        inputNilai(nim, nilai) {

            // Menampung status apakah pencarian mahasiswa berhasil
            let isNotFound = true;

            // Proses pencarian mahasiswa dengan NIM yang sudah ditentukan
            for(let mahasiswa of listMahasiswa) {

                // Jika pencarian berhasil
                if(mahasiswa.nim === nim) {

                    // Set nilai mahasiswa tersebut menjadi nilai yang sudah ditentukan
                    mahasiswa.nilai = nilai;

                    // Set status keberhasilan pencarian mahasiswa agar tidak muncul error nantinya
                    isNotFound = false;
                }
            }
            // Jika pencarian gagal, tampilkan pesan error
            if(isNotFound)
                console.log(`\nError: Mahasiswa dengan NIM '${nim}' tidak ada!\n`)}
    },


    // Perintah untuk men-terminate program
    exit() {
        console.log("Bye!!");
        Menu.isExit = true
    }
};


Menu.start();   // Jalankan program!
/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Fungsi utk menggabungkan 2 object
function gabung(mhs, nilai) {
    for(let proprety in nilai) {
        if(nilai.hasOwnProperty(proprety)) {
            mhs[proprety] = nilai[proprety]
        }
    }
    return mhs
}

// Class Mahasiswa
function Mahasiswa() {
    let name;
    let tglLahir;
    let age;
    let nim;
    let prodi;

    this.init = function(newName, newTglLahir, newNim, newProdi) {
        name = newName;
        nim = newNim;
        tglLahir = newTglLahir;
        age = 2021 - (tglLahir.slice(tglLahir.length - 4));
        prodi = newProdi;
    };

    this.getName = function() {
        return name;
    };

    this.getTglLahir = function() {
        return tglLahir;
    };

    this.getAge = function() {
        return age;
    };

    this.getNim = function() {
        return nim;
    };

    this.getProdi = function() {
        return prodi;
    };

    this.getPeringkat = function() {
        if(!Mahasiswa.hasOwnProperty('peringkat'))
            return null;
        else
            return peringkat;
    }
}

// Class Nilai
function Nilai() {
    let nilai;
    let peringkat;

    this.setNilai = function(newNilai) {
        nilai = newNilai;

        if(100 >= nilai && nilai >= 80)
            peringkat = 'A';
        else if(80 > nilai && nilai >= 60)
            peringkat = 'B';
        else if(60 > nilai && nilai >= 40)
            peringkat = 'C';
        else if(40 > nilai && nilai >= 0)
            peringkat = 'D';
        else
            peringkat = "Ngawur!";
    };

    this.getNilai = function() {
        return nilai;
    };

    this.getPeringkat = function() {
        return peringkat;
    }
}


// Pembuatan object-object
const mahasiswa = new Mahasiswa();
const nilai = new Nilai();

// Inisiasi prompt-sync
const prompt = require('prompt-sync')();

// Menu utama program
let isExit = false;
do {
    console.log('<===== Menu Penilaian =====>');
    console.log('1. Tambah Mahasiswa');
    console.log('2. Penilaian');
    console.log('3. Lihat Seluruh Mahasiswa');
    console.log('4. Keluar');
    console.log('');

    let nav = prompt('> ');
    console.log('');

    switch(nav) {
        case '1':   // Tambah Mahasiswa
            console.log("<==== Tambah Mahasiswa ====>");
            const nama = prompt("Input Nama          : ");
            const tglLahir = prompt("Input Tanggal Lahir : ");
            const nim = prompt("Input NIM           : ");
            console.log("");

            console.log("<= Pilih Prodi");
            console.log("1. S1 SE");
            console.log("2. S1 IF");
            console.log("3. S1 SI");
            let prodi = prompt("> ");

            if(Number(prodi) === 1)
                prodi = "S1 SE";
            else if(Number(prodi) === 2)
                prodi = "S1 IF";
            else if(Number(prodi) === 3)
                prodi = "S1 SI";
            else
                prodi = "Error: Prodi Invalid!";

            mahasiswa.init(nama, tglLahir, nim, prodi);

            console.log("");
            break;

        case '2':   // Penilaian
            console.log("<==== Penilaian ====>");
            prompt("Masukan NIM   : ");
            const n = prompt("Masukan nilai : ");
            console.log('');

            nilai.setNilai(n);
            gabung(mahasiswa, nilai);
            break;

        case '3':   // Lihat Seluruh Mahasiswa
            console.log("<==== Data Mahasiswa ====>\n");
            console.log(`Nama          : ${mahasiswa.getName()}`);
            console.log(`Tanggal lahir : ${mahasiswa.getTglLahir()}`);
            console.log(`Umur          : ${mahasiswa.getAge()}`);
            console.log(`NIM           : ${mahasiswa.getNim()}`);
            console.log(`Prodi         : ${mahasiswa.getProdi()}`);
            console.log(`Grade         : ${mahasiswa.getPeringkat()}`);
            console.log(``);
            break;

        case '4':   // Keluar
            isExit = true;
            break;

        default:    // Jika user memasukan aneh-aneh
            console.log("Error: Mohon hanya input 1-4 saja!");
            console.log("");
            break;
    }
}while(!isExit);
console.log("Bye !!!");
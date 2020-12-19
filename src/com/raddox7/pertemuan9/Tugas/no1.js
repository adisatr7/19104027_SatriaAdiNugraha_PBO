/*  Nama : Satria Adi Nugraha
 *  Alias: @raddox7
 *  Kelas: S1SE-3-A
 *  NIM  : 19104027
 */


// Kelas Hewan
function Hewan(nama, jenis, umur, makanan) {
    this.nama = nama;
    this.jenis = jenis;
    this.umur = umur;
    this.makanan = makanan;
    this.riwayatPenyakit = [];

    // Method menampilkan seluruh riwayat penyakit (jika ada)
    this.getRiwayatPenyakit = function() {
        if(this.riwayatPenyakit.length > 0) {
            console.log(` - Riwayat Penyakit:`);
            let i = 1;
            for(let penyakit of this.riwayatPenyakit) {
                console.log(`\t${i}) ${penyakit}`);
                i++
            }

        }
    };

    // Method menampilkan data hewan
    this.showData = function() {
        console.log(` - Nama    : ${this.nama}`);
        console.log(` - Jenis   : ${this.jenis}`);
        console.log(` - Umur    : ${this.umur}`);
        console.log(` - Makanan : ${this.makanan}`);
        this.getRiwayatPenyakit();
        console.log()
    }
}


/*  Enkapsulasi segala macam input termasuk di dalamnya
    ada fail-safe yang mana ia akan melakukan loop dan
    mengulangi prompt hingga user menginputkan dengan
    benar (Misal: Diminta memasukan angka malah
    memasukan huruf)
 */
const Input = {

    // Inisiasi prompt-sync
    get_input: require('prompt-sync')(),

    // Method untuk meminta user menginputkan string
    str(question) {
        let output;
        do {
            console.log(question);
            output = this.get_input("> ");
            console.log();

            if(output !== "")
                break;
            else
                console.log("Error: Mohon masukan sesuatu!\n")

        }while(true);

        return output
    },

    // Method untuk meminta user menginputkan bilangan
    num(question) {
        let output;
        do {
            console.log(question);
            output = Number(this.get_input("> "));
            console.log();

            if(Number.isFinite(output))
                break;
            else
                console.log("Error: Mohon hanya masukan angka saja!\n")

        }while(true);

        return output
    },

    confirm(question) {
        let output = String();
        let ngaco;
        do {
            console.log(question + " (Y/N)");
            output = this.get_input("> ").toLowerCase();
            console.log();
            ngaco = output !== 'y' && output !== 'n';
            if(ngaco)
                console.log("Error: Mohon hanya masukan 'Y' atau 'N' saja!\n")

        }while(ngaco);

        return output === 'y'
    }
};


// Segala hal yang berhubungan dengan ekosistem ditampung di sini
const Ecosystem = {
    habitat: [],    // Habitat penampung hewan-hewan
    animal: {},     // Obyek hewan

    // Method untuk menambah hewan ke habitat
    registerAnimals(amount) {
        for(let i=0; i<amount; i++) {

            // Index hewan terakhir yang terdaftar
            const noUrut = Ecosystem.habitat.length + 1;

            // Proses penambahan hewan
            console.log(`<=== Data Hewan ke-${noUrut} ===>\n`);
            Ecosystem.animal = new Hewan(
                Input.str("Apa nama hewannya?"),    // Parameter: nama
                Input.str("Apa jenis hewannya?"),   // Parameter: jenis
                Input.num("Berapa tahun umurnya?"), // Parameter: umur
                Input.str("Apa makanannya?")        // Parameter: makanan
            );
            Ecosystem.habitat.push(Ecosystem.animal);

            // User ditanya apakah hewan memiliki riwayat penyakit
            console.log(``);
            const isPenyakitan = Input.confirm(
                `<=== Riwayat Penyakit Hewan ke-${noUrut} ===>\n\n` +
                         `Apakah hewan tersebut pernah memiliki penyakit sebelumnya?`
            );

            // Jika iya
            if(isPenyakitan) {

                // Menanyakan jumlah penyakit yang pernah diderita hewan tersebut
                const jmlPenyakit = Input.num("Berapa banyak penyakit?");

                // Index hewan terakhir yang terdaftar
                let lastAnimalIndex = Ecosystem.habitat.length - 1;

                // User diminta menginput nama penyakit satu-persatu
                for(let i=0; i<jmlPenyakit; i++)
                    Ecosystem.habitat[lastAnimalIndex].riwayatPenyakit.push(
                        Input.str(`<=== Penyakit ke-${i+1} ===>\n\nApa nama penyakitnya?`)
                    )
            }

            console.log(`Berhasil menambahkan ${Ecosystem.habitat[noUrut -1].nama} ke database!\n`)
        }
    },

    // Method untuk mengubah attribute hewan
    editAnimalAt(index) {
        console.log(`<=== Memperbarui data ${Ecosystem.habitat[index].nama} ===>\n`);
        Hewan.prototype.update = function() {
            const nama = Input.str("Apa nama hewannya?");
            const jenis = Input.str("Apa jenis hewannya?");
            const umur = Input.num("Berapa tahun umurnya?");
            const makanan = Input.str("Apa makanannya?");

            let riwayatPenyakit = [];

            // User ditanya apakah hewan memiliki riwayat penyakit
            console.log(``);
            const isPenyakitan = Input.confirm(
                `<=== Riwayat Penyakit Hewan ===>\n\n` +
                `Apakah hewan tersebut pernah memiliki penyakit sebelumnya?`
            );

            // Jika iya
            if(isPenyakitan) {

                // Menanyakan jumlah penyakit yang pernah diderita hewan tersebut
                const jmlPenyakit = Input.num("Berapa banyak penyakit?");

                // User diminta menginput nama penyakit satu-persatu
                for(let i=0; i<jmlPenyakit; i++)
                    riwayatPenyakit.push(
                        Input.str(`<=== Penyakit ke-${i+1} ===>\n\nApa nama penyakitnya?`)
                    )
            }

            return {nama, jenis, umur, makanan, riwayatPenyakit}
        };

        Ecosystem.habitat[index] = Ecosystem.habitat[index].update()
    },

    // Expose seluruh data hewan yang terdaftar
    expose() {
        const total = Ecosystem.habitat.length;
        console.log(`Daftar hewan yang terdaftar di ekosistem (total: ${total}):\n`);

        for(let i=0; i<total; i++) {
            console.log(`Hewan ke-${i+1}`);
            Ecosystem.habitat[i].showData();
        }
    }
};


// Segala yang berhubungan dengan menu dan navigasinya ditampung di sini
const Menu = {
    isExit: false,  // Sebagai pemberhenti looping program

    // Method untuk menampilkan menu utama program
    start() {
        do{
            console.log("<=== Menu Utama ===>\n");
            console.log("1. Tambah hewan");
            console.log("2. Edit hewan");
            console.log("3. Pantau ekosistem");
            console.log("4. Keluar");

            const nav = Input.num('');

            switch(nav) {
                case 1:
                    Menu.goto.addAnimal();
                    break;
                case 2:
                    Menu.goto.editAnimal();
                    break;
                case 3:
                    Menu.goto.showAnimal();
                    break;
                case 4:
                    Menu.exit();
                    break;
            }

        }while(!Menu.isExit)
    },


    // Kumpulan sub-menu program
    goto: {

        // Sub-menu untuk menambah hewan baru
        addAnimal() {

            // User ditanya ingin mendaftarkan berapa hewan
            const n = Input.num("<=== Penambahan Hewan ===>\n\n" +
                                         "Ada berapa banyak populasi hewan di habitat?");

            // Tambahkan hewan ke ekosistem sebanyak 'n'
            Ecosystem.registerAnimals(n);

            // Beritahu user proses penambahan sudah selesai!
            console.log(`Berhasil menambahkan ${n} hewan ke database!\n`)
        },


        // Sub-menu untuk mengedit data hewan
        editAnimal() {

            // User ditanya ingin mengedit data hewan yang mana
            const i = Input.num("<=== Memperbarui Data Hewan ===>\n\n" +
                                         "Ingin mengedit data hewan keberapa?") -1;

            // Lakukan pengeditan pada data hewan urutan ke-'i'
            if(i >= 0 && i < Ecosystem.habitat.length) {
                Ecosystem.editAnimalAt(i);

                // Beritahu user proses pengeditan sudah selesai!
                console.log(`Berhasil mengubah hewan ke-${i+1}!\n`)
            }

            // Jika user menginput yang aneh-aneh
            else
                console.log("Error: Nomor urut hewan tidak ditemukan!\n")
        },


        // Sub-menu untuk menampilkan semua data hewan
        showAnimal() {

            // Expose seluruh data hewan yang terdaftar di ekosistem
            Ecosystem.expose();
        },
    },


    // Keluar program
    exit() {

        // Menanyakan user apakah user yakin ingin keluar
        Menu.isExit = Input.confirm("Anda yakin ingin keluar?");

        if(Menu.isExit)
            console.log("Menutup program...\n");
        else
            console.log("Mengembalikan user ke menu utama...\n")
    }
};


Menu.start();   // Jalnkan program!
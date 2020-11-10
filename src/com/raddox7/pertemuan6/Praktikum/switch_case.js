// Variable yang akan dimasukkan ke switch
var no_hari = "RAB"

// Switch-nya
switch(no_hari) {

    case "MIN":
        console.log("Minggu")
        break

    case "SEN":
        console.log("Senin")
        break

    case "SEL":
        console.log("Selasa")
        break

    case "RAB":
        console.log("Rabu")
        break

    case "KAM":
        console.log("Kamis")
        break

    case "JUM":
        console.log("Jum'at")
        break

    case "SAB":
        console.log("Sabtu")
        break

    default:
        console.log("Tidak boleh!")
        break
}
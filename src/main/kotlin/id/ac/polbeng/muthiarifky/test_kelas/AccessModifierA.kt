package id.ac.polbeng.muthiarifky.test_kelas
//Muthia Rifky Ananda

// Kelas Mahasiswa dengan properti nama dan nrp
open class Mahasiswa(var nama: String, var nrp: Int) {

    // Fungsi info untuk menampilkan detail Mahasiswa
    open fun info() {
        println("$nama\n$nrp") // Perbaikan: menggunakan "$" untuk interpolasi variabel dan menghapus '+' yang tidak perlu
    }

    // Mengoverride metode toString dari kelas Any
    override fun toString(): String { // Perbaikan: 'toString' perlu memiliki kata kunci 'override' untuk menggantikan metode dari kelas Any
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}

// Kelas turunan KetuaHima yang mewarisi dari Mahasiswa
class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {

    // Mengoverride fungsi info untuk menambahkan jurusan
    override fun info() { // Perbaikan: Menghapus @Override yang tidak diperlukan (tidak digunakan di Kotlin)
        println("$nama\n$nrp\n$jurusan") // Perbaikan: menggunakan "$" untuk interpolasi variabel dan menghapus '+' yang tidak perlu
    }
}

// Fungsi utama untuk menguji kelas
fun main() {
    val budi = Mahasiswa("Budi Gunawan", 1106123)
    val anton = KetuaHima("Anton", 1106789, "Teknik Informatika")

    // Menampilkan detail anton menggunakan metode toString yang di-override
    println(anton.toString())
    println()

    // Menampilkan info anton menggunakan metode info yang di-override
    anton.info()
    println("Jenis Kelas = " + anton.javaClass.simpleName)
    println()

    // Menampilkan info budi menggunakan metode info dari kelas dasar
    budi.info()
    println("Jenis Kelas = " + budi.javaClass.simpleName)

    val ucok = KetuaHima("Ucok", 1105239, "Teknik Elektro")
    println()

    // Menampilkan info ucok menggunakan metode info yang di-override
    ucok.info()
    println("Jenis Kelas = " + ucok.javaClass.simpleName)
}

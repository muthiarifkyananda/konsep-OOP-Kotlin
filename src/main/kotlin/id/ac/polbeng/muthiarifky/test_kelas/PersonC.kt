package id.ac.polbeng.muthiarifky.test_kelas
// Muthia Rifky Ananda
class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val budi = PersonC("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}

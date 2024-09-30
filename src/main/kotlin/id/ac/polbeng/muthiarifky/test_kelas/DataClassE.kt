package id.ac.polbeng.muthiarifky.test_kelas
//Muthia Rifky Ananda

fun main() {
    val meri = Student("Meri", 20)
// Destructuring Declaration
    val(name, age) = meri
    println("Name = $name")
    println("Age = $age")
}

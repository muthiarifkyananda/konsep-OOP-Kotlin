package id.ac.polbeng.muthiarifky.test_kelas
//Muthia Rifky Ananda

interface A {
    fun demo() {
        println("From interface A")
    }
}
interface B {
    fun demo() {
        println("From interface B")
    }
}
// This class implements X and Y interfaces
class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}

fun main() {
    val obj = MyClassB()
    obj.demo()
}

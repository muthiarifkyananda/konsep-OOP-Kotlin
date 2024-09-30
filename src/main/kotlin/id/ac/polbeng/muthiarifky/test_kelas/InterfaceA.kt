package id.ac.polbeng.muthiarifky.test_kelas
//Muthia Rifky Ananda

interface MyInterface{
    var str: String
    fun demo()
    fun func(){
        println("Hello")
    }
}
class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak"
    override fun demo() {
        println("Demo Function")
    }
}
fun main() {
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)
}

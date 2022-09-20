import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        test1()
        test2()
    }

    fun test1() {
        // Задача №2951. Стоимость покупки
        val dat = Scanner(System.`in`)
        val a = dat.nextInt()
        val b = dat.nextInt()
        val n = dat.nextInt()
        val c = (a * 100 + b) * n
        println((c / 100).toString() + "\t" + c % 100)
    }

    fun test2() {
        // Задача №2936. Гипотенуза
        val scan = Scanner(System.`in`)
        val a = scan.nextInt()
        val b = scan.nextInt()
        val c = Math.sqrt((a * a + b * b).toDouble())
        println(c)
    }
}
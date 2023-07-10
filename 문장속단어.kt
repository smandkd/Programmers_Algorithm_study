import java.util.*

class Main{
    fun solution(str: String) : String {
        var answer = "";
        var m = Int.MIN_VALUE;
        val s = str.split(" ").toTypedArray();

        for(t in s) {
            val len = t.length
            if(len > m) {
                m = len
                answer = t
            }
        }

        return t
    }

    fun main(args: Array<String>) {
        val T = Main();
        val scanner = Scanner(System.in)
        val str = scanner.nextLine()
        println(T.solution(str));
    }
}
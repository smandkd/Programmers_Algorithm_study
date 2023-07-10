import java.util.Scanner

class Main {
    fun solution(str: String, t: char) : Int {
        var answer = 0;
        val upperCasestr = str.toUpperCase()
        val upperCaset = t.toUpperCase()
        for(i in 0 until upperCasestr.length) {
            if(upperCasestr[i] == upperCaset) answer++
        }

        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val scanner = Scanner(System.in)
            val str = scanner.next();
            val c = scanner.next()[0]
            println(T.solution(str, c))
        }
    }

}
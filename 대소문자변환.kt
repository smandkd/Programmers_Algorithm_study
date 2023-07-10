import java.util.*

class Main {
    fun solution(str: String): String {
        val array = str.toCharArray()
        val sb = StringBuilder()

        for(a in array) {
            if(a.isUpperCase()) sb.append(a.toLowerCase())
            else sb.append(a.toUpperCase())
        }
        return sb.toString()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            
            val str = "StudY"
            println(T.solution(str))
        }
    }
}
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

class Main{
    fun solution(str: String) : String {
        var answer = ""
        var m = Int.MIN_VALUE
        var pos = 0

        while((pos=str.split(" ").indexOf()) != -1) {
            var t = str.substring(0, pos)
            var len = t.length()
            if(len > m) {
                m = len
                answer = t
            }

            str = str.substring(pos+1)
        }

        if(str.length > m) answer = str

        return t
    }

    fun main(args: Array<String>) {
        val T = Main();
        val scanner = Scanner(System.in)
        val str = scanner.nextLine()
        println(T.solution(str))
    }
}
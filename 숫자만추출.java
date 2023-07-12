import java.util.*;

// tip: each public class is put in its own file
import java.util.*;

class Main
{
    public int solution(String str) {
        String answer = str.toUpperCase().replaceAll("[A-Z]", "");
        return Integer.parseInt(answer);
    }

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print(T.solution(str));
    }
}

class Main
{
    public int solution(String str) {
        int answer = 0;
        for(char x: s.toCharArray()) {
            if(x>= && x<=57) answer = answer*10+(x - 48);
        }
        return answer;
    }

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print(T.solution(str));
    }
}

// tip: each public class is put in its own file
import java.util.*;

class Main
{
    public int solution(String str) {
        int answer = 0;
        for(char x: s.toCharArray()) {
            if(Character.isDigit()) answer += x;
        }
        return answer;
    }

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print(T.solution(str));
    }
}
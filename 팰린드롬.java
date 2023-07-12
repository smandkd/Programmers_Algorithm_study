// tip: each public class is put in its own file
import java.util.Scanner;
import java.util.*;

class Main
{
    public String solution(String str) {
        String answer = "NO";

        String s = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();

        if(s.equals(tmp)) answer = "YES";

        return answer;
    }

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}

// tip: each public class is put in its own file

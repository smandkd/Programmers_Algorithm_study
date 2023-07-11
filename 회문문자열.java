// tip: each public class is put in its own file
import java.util.Scanner;

class Main
{
    public String solution(String str) {
        String answer = "";
        int sp = 0;
        int lp = str.length() - 1;
        String string = str.toUpperCase();

        while(sp<lp) {
            if(string.charAt(sp) != string.charAt(lp)) {
                answer = "NO";
                break;
            }
            else {
                sp++;
                lp--;
            }
            answer = "YES";
        }
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
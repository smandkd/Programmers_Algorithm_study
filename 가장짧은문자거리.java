// tip: each public class is put in its own file
import java.util.*;

class Main
{
    public int[] solution(String str, char a) {
        int[] array_index = new int[str.length()];
        int p = 1000;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != a) {
                p++;
                array_index[i] = p;
            }
            else {
                p = 0;
                array_index[i] = p;
            }
        }
        p = 1000;

        for(int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) != a) {
               p++;
               array_index[i] = Math.min(array_index[i], p);
            }
            else {
                p=0;
            }
        }

        return array_index;
    }

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        for(int x: T.solution(str,c)){
            System.out.print(x+" ");
        }
    }
}
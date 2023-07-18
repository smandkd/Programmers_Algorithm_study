// tip: each public class is put in its own file
import java.util.*;

class Main
{
    public String solution(int a, String s) {
        char[] array = s.toCharArray();
        int[] array_int = new int[s.length()];
        StringBuilder sb = new StringBuilder();
       

        for(int i = 0; i < s.length(); i++) {
            if(array[i] == '#') {
                array_int[i] = 1;
            }
            else {
                array_int[i] = 0;
            }
        }

        for(int i = 0; i < s.length(); i += 7) {
            int k = 0;
            char asc = 0;
            while(k < 7 && i+k < s.length()) {
                asc += Math.pow(2, 6 - k)*array_int[i + k]; 
                k++;
            }
            sb.append(asc);
        }

        return sb.toString();
    }
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String str = in.next();
        System.out.println(T.solution(a, str));
    }
}
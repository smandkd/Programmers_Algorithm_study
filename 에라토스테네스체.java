// tip: each public class is put in its own file
import java.util.*;

class Main
{
    public int solution(int n) {
        int count = 0;
        int[] ch = new int[n+1];

        for(int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                count++;
                for(int j=i; j <= n; j=j+i) ch[j] = 1;
            }
        }
        

        return count;
    }

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(T.solution(n));
    }
}
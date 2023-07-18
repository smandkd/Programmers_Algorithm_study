// tip: each public class is put in its own file
import java.util.*;

class Main
{
    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    
        return arr;
    }

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = T.solution(n);

        for(int a : arr) {
            System.out.print(a + " ");
        }
        
    }
}
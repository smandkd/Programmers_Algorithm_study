// tip: each public class is put in its own file
import java.util.*;

class Main
{
    public ArrayList<Character> solution(int n, int[] arr, int[] arr2) {
        ArrayList<Character> list = new ArrayList<>();
        int i = 0;

        while(i < n) {
            if(arr[i] == 1 && arr2[i] == 3) {
                list.add('A');
            }
            else if(arr[i] == 2 && arr2[i] == 1) {
                list.add('A');
            }
            else if(arr[i] == 3 && arr2[i] == 2) {
                list.add('A');
            }
            else if(arr[i] == arr2[i]) {
                list.add('D');
            }
            else {
                list.add('B');
            }

            i++;
        }


        return list;
    }
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
        
        for(char a : T.solution(n, arr, arr2)) {
            System.out.println(a);    
        }
        
    }
}
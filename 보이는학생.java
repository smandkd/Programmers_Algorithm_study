import java.util.Scanner;
  
class Main {
  public int solution(int n, int[] arr) {
        int visible = 1;
        int first = arr[0];

        for(int i = 0; i < n - 1; i++) {
            if(first < arr[i+1]) {
                visible++;
                first = arr[i+1];
            }
        }
            
        return visible;
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
    	arr[i] = in.nextInt();
    }
    System.out.println(T.solution(n, arr));
  }
}
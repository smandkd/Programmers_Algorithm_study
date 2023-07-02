import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        
        while(true) {
            if(a == 1) {
                break;
            }
            else if(a == 0) {
                break;
            }
            else {
                a = a%2;
            }
            
        }
        
        if(a == 1) {
            System.out.println(n + " is odd");
        }
        else {
            System.out.println(n + " is even");
        }
    }
}
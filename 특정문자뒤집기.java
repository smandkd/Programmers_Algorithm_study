// Don't place your source in a package
import java.util.*;


// Please name your class Main
class Main {
	public String solution(String str) {
	    
        
        char[] c = str.toCharArray();
        int sp = 0, lp = str.length() - 1;
        while(sp < lp) {
            if( (c[sp] >= 65 && c[sp] <= 90) || (c[sp] >= 97 && c[sp] <= 122) ) {
                if( (c[lp] >= 65 && c[lp] <= 90) || (c[lp] >= 97 && c[lp] <= 122) ) {
                    char tmp = c[sp];
                    c[sp] = c[lp];
                    c[lp] = tmp;
                    sp++;
                    lp--;
                }
                else {
                    lp--;
                }
            }
            else {
                sp++;
            }
        }
        String string = String.valueOf(c);
	    return string;
	}
	
	public static void main (String[] args) {
	    Main T = new Main();
	    Scanner in = new Scanner(System.in);
		String str = in.next();
        System.out.print(T.solution(str));
	}
}
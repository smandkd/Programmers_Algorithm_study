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

// Don't place your source in a package
import java.util.*;


// Please name your class Main
class Main {
	public String solution(String str) {
        char[] c = str.toCharArray();
        int sp = 0, lp = str.length() - 1;
        while(sp < lp) {
            if(!Character.isAlphabetic( c[sp]) ) sp++;
            else if(!Character.isAlphabetic( c[lp]) ) lp--;
            else {
                char tmp = c[sp];
                c[sp] = c[lp];
                c[lp] = tmp;
                sp++;
                lp--;
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

public class 클래스 {
    //정적 필드
    static 타입 필드 = 초기값;
    // 정적 메소드
    static 리턴타입 메소드(매개변수) {...}
}
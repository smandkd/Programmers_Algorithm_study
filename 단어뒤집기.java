// Don't place your source in a package
import java.util.*;


// Please name your class Main
class Main {
	public ArrayList<String> solution(int n, String[] str) {
	    ArrayList<String> array = new ArrayList<>();
	    
	    for(String x : str) {
            int rt = 0, lt = x.length() - 1;
	    }
	    
	    return array;
	}
	
	public static void main (String[] args) {
	    Main T = new Main();
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
		    str[i] = in.next();
		}
		for(String x : T.solution(n, str)) {
		    System.out.println(x);    
		}
	}
}

// Don't place your source in a package
import java.util.*;


// Please name your class Main
class Main {
	public ArrayList<String> solution(int n, String[] str) {
	    ArrayList<String> array = new ArrayList<>();
	    
	    for(String s : str) {
            char[] x = s.toCharArray();
            int rt = 0, lt = s.length() - 1;
            while(rt < lt) {
                char tmp = x[rt];
                x[rt] = x[lt];
                x[lt] = tmp;
                rt++;
                lt--;
            }
            String tmp = String.valueOf(x);
            array.add(tmp);
        }
	    
	    return array;
	}
	
	public static void main (String[] args) {
	    Main T = new Main();
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
		    str[i] = in.next();
		}
		for(String x : T.solution(n, str)) {
		    System.out.println(x);    
		}
	}
}
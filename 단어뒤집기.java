// Don't place your source in a package
import java.util.*;


// Please name your class Main
class Main {
	public ArrayList<String> solution(int n, String[] str) {
	    ArrayList<String> array = new ArrayList<>();
	    
	    for(String x : str) {
	        String m = new StringBuilder(x).reverse().toString();
	        array.add(m);
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
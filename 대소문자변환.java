import java.util.*;

class Main {
  public String solution(String str) {
  	char[] array = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    
    for(char a: array) {
    	if(Character.isUpperCase(a)) {
           sb.append(Character.toLowerCase(a));
        }
        else {
            sb.append(Character.toUpperCase(a));
        }
    }
    return sb.toString();
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();

    System.out.println(T.solution(str));
    
  }
}
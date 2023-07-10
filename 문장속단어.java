
import java.util.*;

class Main {
  public String solution(String str) {
      String answer = "";
      int m = Integer.MIN_VALUE;
      String[] s = str.split(" ");

      for(String t: s) {
          int len = t.length();
          if(len > m) {
              m = len;
              answer = t;
          }
      }


      return answer;
  }
  
  public static void main(String[] args){
    Main T = new Main();
    
Scanner in=new Scanner(System.in);
  String str = in.nextLine();
    System.out.println(T.solution(str));
    
  }
}


import java.util.*;

class Main {
  public String solution(String str) {
      String answer = "";
      int m = Integer.MIN_VALUE, pos;
      
      while((pos=str.indexOf(' ')) != -1) {
          String tmp = str.substring(0, pos);
          int len = tmp.length();

          if( len > m ) {
              len = m;
              answer = tmp;
          }

          str = str.substring(pos+1);
      }
      if(str.length() > m) answer = str;
      
      return answer;
  }
  
  public static void main(String[] args){
    Main T = new Main();
    
Scanner in=new Scanner(System.in);
  String str = in.nextLine();
    System.out.println(T.solution(str));
    
  }
}
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String c = "";
        
        String a = my_string.substring(0, s);
        if(my_string.length() - overwrite_string.length() - s > 0) {
            c = a + overwrite_string + my_string.substring(overwrite_string.length() + s);    
            
        } else {
            c = a + overwrite_string;
        }
        
        
        
        return c;
    }
}
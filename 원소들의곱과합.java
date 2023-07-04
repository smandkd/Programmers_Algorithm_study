class Solution {
    public int solution(int[] num_list) {
        int a = 1;
        int b = 0;        
        
        for(int i = 0; i < num_list.length; i++) {
            if( num_list[i] == 0 ) {
                break;
            }
            else {
                a = a * num_list[i];    
            }
        }
        
        for(int i = 0; i < num_list.length; i++) {
            b += num_list[i];
        }
        
        b = b*b;
        
        if( a < b ) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
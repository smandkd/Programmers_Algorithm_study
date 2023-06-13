import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> name_yearning = new HashMap<>();
        int[] answer = new int[photo.length];
       
        for(int i = 0; i < name.length; i++) {
            name_yearning.put(name[i], yearning[i]);    
        }
        
        for(int i = 0; i < photo.length; i++) {
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++) {
                if(name_yearning.containsKey(photo[i][j])){
                    sum += name_yearning.get(photo[i][j]);    
                }
                else {
                    
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}
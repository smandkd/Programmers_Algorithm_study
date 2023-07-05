import java.util.*;

class Solution {
    public static ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++) {
            if(flag[i] == true) {
                for(int j = 0; j < arr[i]*2; j++) {
                    array.add(arr[i]);
                }
            }
            else {
                for(int k = 0; k < arr[i]; k++) {
                    array.remove(array.size()-1);
                }
            }
        }
        
        return array;
    }
}
import java.util.*;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int j : array){
            map.put(j,map.getOrDefault(j,0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1.0*array.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
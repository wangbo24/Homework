class Solution {
    public int singleNumber(int[] nums) {
        /*
        int n = 0;
        for(int num : nums)
            n ^= num;
        return n;*/
        
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        for(Integer num : map.keySet()){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}
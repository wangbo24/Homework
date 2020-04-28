class Solution {
    public int lengthOfLIS(int[] nums) {
        int max = 0;
            int[] m = new int[nums.length];
            for(int i= 0;i < nums.length; i++){
                int p = 0;
                int pro = 1;
                m[p] = nums[i];
               // System.out.println(m.length);
               // System.out.println(nums.length);
                for(int j = i + 1; j < nums.length; j++){
                   if (m[p] < nums[j]) {
                       p++;
                       m[p] = nums[j];
                       pro++;
                   } else {
                       if(p >= 1) {
                           if (m[p - 1] < nums[j]) {
                               m[p] = nums[j];
                           }
                       }
                   }
                }
                m = new int[nums.length];
                if(pro > max){
                    max = pro;
                }
            }
            return max;
    }
}
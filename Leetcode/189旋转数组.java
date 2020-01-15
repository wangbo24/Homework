public void rotate(int[] nums, int k){
        int length = nums.length;
        int n = k%length;
        int pro = nums[length - 1];
        for(int i = 0;i < nums.length;i++){
            if(length - n - 1 - i < 0){
                i = i - length;
            }
            nums[length - 1 - i] = nums[length - n - 1 - i];
        }
        nums[(length - 1 + n)%length] = pro;
    }

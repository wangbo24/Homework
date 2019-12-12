*public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length];
        for(int i = 0;i < nums1.length;i++){
            a[i] = -1;
            for(int j = 0;j < nums2.length;j++){
                if(nums2[j] == nums1[i]){
                    for(int k = j;k < nums2.length;k++){
                        if(nums2[k] > nums2[j]){
                            a[i] = nums2[k];
                            break;
                        }
                    }
                }
            }
        }
        return a;
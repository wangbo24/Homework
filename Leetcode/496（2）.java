 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] stack = new int[nums2.length];
        Map<Integer, Integer> map = new HashMap<>();
        int top = -1; //栈顶
        for(int i = 0; i < nums2.length; i++){
            while(top > -1 && nums2[i] > stack[top]){
                map.put(stack[top], nums2[i]);
                top--;
            }
            stack[++top] = nums2[i];
        }
        int[] ret = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            ret[i] = map.getOrDefault(nums1[i], -1);
        }
        return ret;
    }
class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int n = 0;
        stack.push(i);
        while(i < height.length){
            while(!stack.isEmpty() && height[stack.peek()] < height[i]){
                int top = stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                n += (i-stack.peek()-1)*(Math.min(height[stack.peek()], height[i]) - height[top]);
                
            }
            stack.push(i++);
        }
        return n;
    }
    /**
    public int trap(int[] height) {
        int left = 0; //左边最高的
        int right = height.length - 1; //右边最高的
        int tmp = 0;
        int n = 0;
        while(right > left){
            if(height[left] >= height[right]){
                tmp = right - 1;
                while(height[tmp] <= height[right] && tmp > left){
                    n += height[right] - height[tmp];
                    tmp--;
                }
                right = tmp;
            }else{
                tmp = left + 1;
                while(height[tmp] <= height[left]){
                    n += height[left] - height[tmp];
                    tmp++;
                }
                left = tmp;
            }
        }
        return n;
    }
    */
}
public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(right > left){
            int area = (right - left)*(height[left] > height[right] ? height[right] : height[left]);
            maxArea = maxArea > area ? maxArea : area;
            if(height[left] > height[right]){
                right--;
            }else if(height[left] < height[right]){
                left++;
            }else{
                left++;
                right--;
            }
        }
        return maxArea;
    }
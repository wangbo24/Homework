public class Solution {
    public int Fibonacci(int n) {
        if(n <= 0){
            return 0;
        }
        if(n < 3){
            return 1;
        }
        int ret = 0;
        int r1 = 1,r2 = 1;
        for(int i = 3;i <= n;i++){
            ret = r1 + r2;
            r1 = r2;
            r2 = ret;
        }
        return ret;
    }
}
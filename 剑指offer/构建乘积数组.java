import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        for(int i = 0;i < len;i++){
            int n = 1;
            for(int j = 0;j < len;j++){
                if(j != i){
                   n *= A[j]; 
                }
            }
            B[i] = n; 
        }
        return B;
    }
}
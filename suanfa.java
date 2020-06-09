public int backPackII(int m, int[] A, int[] V) {
// write your code here
int num = A.length;
if(m == 0 || num == 0)
return 0;
//多加一行一列，用于设置初始条件
int[][] maxValue = new int[num + 1][m + 1];
//初始化所有位置为0，第一行和第一列都为0，初始条件
for(int i = 0; i <= num; ++i){
maxValue[i][0] = 0;
}
for(int i = 1; i <= m; ++i){
maxValue[0][i] = 0;
}
for(int i = 1; i <= num; ++i){
for(int j = 1; j <= m; ++j){
//第i个商品在A中对应的索引为i-1: i从1开始
//如果第i个商品大于j,说明放不下， 所以(i,j)的最大价值和(i-1,j)相同
if(A[i - 1] > j){
maxValue[i][j] = maxValue[i - 1][j];
}
else{
//如果可以装下，分两种情况，装或者不装
//如果不装，则即为(i-1, j)
//如果装，需要腾出放第i个物品大小的空间： j - A[i-1],装入之后的最大价值即为(i -
1, j - A[i-1]) + 第i个商品的价值V[i - 1]
//最后在装与不装中选出最大的价值
int newValue = maxValue[i - 1][j - A[i - 1]]
+ V[i - 1];
maxValue[i][j] = Math.max(newValue
, maxValue[i - 1][j]);
}
}
}
//返回装入前N个商品，物品大小为m的最大价值
return maxValue[num][m];
}
}
/
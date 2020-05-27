class Solution {
   public static int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < len;i++){
            int j = 0;
            int p = 0;
            int max = position[j];
            while(j < len) {
                if (max < position[j]) {
                    max = position[j];
                    p = j;
                }
                j++;
            }
            double t = 1.0*(target - max) / speed[p];
            //System.out.println(t);
            if(list.isEmpty() || list.get(list.size() - 1) < t){
                list.add(t);
            }
            position[p] = -1;
        }
        return list.size();
    }
}
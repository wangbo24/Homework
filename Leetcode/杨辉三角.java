import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> trian = new ArrayList<>(numRows);
        for(int i = 0; i < numRows;i++ ){
            trian.add(new ArrayList<>());
            trian.get(i).add(1);
        }
        for(int i = 1;i < numRows; i++){
            for(int j = 1;j < i;j++) {
                int ret = trian.get(i - 1).get(j - 1) + trian.get(i -1).get(j);
                trian.get(i).add(ret);
            }
            trian.get(i).add(1);
        }
        return trian;
    }
}
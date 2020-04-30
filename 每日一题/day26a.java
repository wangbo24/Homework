import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int hou = sc.nextInt();
        sc.nextLine();
        while(hou > 0){
            map.put(sc.next(),0);
            hou--;
        }
        map.put("Invalid",0);
        int tou = sc.nextInt();
        sc.nextLine();
        while(tou > 0) {
            String pro = sc.next();
            if(map.get(pro) == null){
                map.put("Invalid",map.get("Invalid") + 1);
            }else{
                map.put(pro,map.get(pro) + 1);
            }
            tou--;
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
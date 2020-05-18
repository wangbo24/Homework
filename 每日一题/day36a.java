import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNextLine()){
            Map<Character,Integer> map = new LinkedHashMap<>();
            for(int i = 'A'; i <= 'Z'; i++){
                char a = (char)i;
                map.put(a,0);
            }
            String str = sc.nextLine();


        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                map.put(ch,map.get(ch)+1);
            }
        }
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}

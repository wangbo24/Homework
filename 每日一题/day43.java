import java.util.*;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Set<String> set = new LinkedHashSet<>();
            int n = sc.nextInt();
            sc.nextLine();
            while(n-- > 0){
                String str = sc.nextLine();
                set.add(byCharFoundNumber(str));
                //
            }
            //sc.nextLine();
            List<String> list = new ArrayList<>();
            for(String s : set){
                list.add(s);
            }
            Collections.sort(list);
            for(String s : list){
                System.out.println(byCharFoundNumber(s));
            }
            System.out.println();
        }
    }
    public static String byCharFoundNumber(String s){
        int k = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            int j = -990;
            if(c >= 'A' && c <= 'O') {
                j = (c - 'A') / 3 + 2;
                k++;
            }else if(c >= 'P' && c <= 'S'){
                j = 7;
                k++;
            }else if(c >= 'T' && c <= 'V'){
                j = 8;
                k++;
            }else if(c >= 'W' && c <= 'Z'){
                j = 9;
                k++;
            }
            else if(c >= '0' && c <= '9'){
                j = c - '0';
                k++;
            }
            sb.append(j);
            if(k == 3){
                sb.append("-");
                k++;
            }
        }
        return sb.toString().replaceAll("-990","");
    }
}

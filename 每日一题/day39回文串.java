import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String result = "NO";
            String str = sc.nextLine();
            int len = str.length();
           
            if(str == null){
                result = "YES";
            }
            //asdffds
            if(len <= 10){
                //asdffds
                for(int i = 0; i < len; i++){
                    List<Character> list = new ArrayList<>();
                    for(int j = 0; j < len;j++){
                        list.add(str.charAt(j));
                    }
                    if(i < len/2) {
                        list.add(i, str.charAt(len - 1 - i));
                    }else{
                        list.add(i+1, str.charAt(len - 1 - i));
                    }
                    //System.out.println(String.valueOf(list));

                    if(isPlalindrome(list)){
                        result = "YES";
                        break;
                    }
                }
            }
            System.out.println(result);
        }
        //isPlalindrome("ASDF");
    }
    public static boolean isPlalindrome(List list){
        int len = list.size();
        for(int i = 0; i < len/2;i++ ){
            if(list.get(i) != list.get(len - 1 - i)){
                return false;
            }
        }
        return true;
    }

}

import java.util.*;

public class Replacement {
    public static void main(String[] args) {
        String str = "hello    ooo   ppp";
        String s = replaceSpace(str);
        System.out.println(s);
    }
    public static String replaceSpace(String iniString) {
        // write code here
       /* if(iniString == null || length <= 0){
            return iniString;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < iniString.length();i++){
            char c = iniString.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();*/
        return iniString.replace(" ", "%20");
    }
}
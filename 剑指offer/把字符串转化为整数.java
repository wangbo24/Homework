
public class Solution {
    
    public int StrToInt(String str) {
        if(str.length() == 0)
              return 0;
        int num = 0;
        if(str.charAt(0) >= '0' && str.charAt(0) <= '9'){
            num = Character.getNumericValue(str.charAt(0));
        }
        for(int i = 1;i < str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num = num*10 + Character.getNumericValue(str.charAt(i));
               
            }else{
                return 0;
            }
        }
        if(str.charAt(0) == '-'){
            return -num;
        }
        return num;
    }
}
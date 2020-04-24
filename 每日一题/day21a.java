import java.util.Scanner;

//解密题
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while(sc.hasNext()){
             str = sc.next();


        }
        System.out.println(getDecode(str));
    }

    private static String getDecode(String str) {
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length;i++){
            if(ch[i] >= 'F' && ch[i] <= 'Z'){
                ch[i] = (char) (ch[i] - 5);
            }else{
                ch[i] = (char) (ch[i] + 21);
            }
        }
        String s = new String(ch);
        return s;
    }
}


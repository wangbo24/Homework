import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String A = sc.next();
            String B = sc.next();
            sc.nextLine();
            System.out.println(isNow(A, B));
        }
    }

    private static String isNow(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        String result = "Yes";
        char[] ch = b.toCharArray();
        for(char c : ch){
            int index = sb.indexOf(String.valueOf(c));
            if(index != -1){
                sb.deleteCharAt(index);
            }else{
                result = "No";
                break;
            }
        }
        return result;
    }
}


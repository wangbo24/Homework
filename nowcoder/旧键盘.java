import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        String s = sc.nextLine().toUpperCase();
        Set<Character> set = new HashSet<>();
        for(char ch : s .toCharArray()){
            set.add(ch);
        }
        Set<Character> set1 = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
               if(!set1.contains(ch)){
                   System.out.print(ch);
                   set1.add(ch);
               }
            }
        }
        System.out.println();
    }
}

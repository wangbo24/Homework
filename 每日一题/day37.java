import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int num = 0;
        int j = 0;
        int max = 0;

        List<Integer> list = new ArrayList<>();
        while (j++ < n) {
            int i = sc.nextInt();
            int l = sc.nextInt();
            sc.nextLine();
            if (i == 1) {
                list.add(l);
                num += l;
            } else {
                list.remove(list.indexOf(l));
                num -= l;
            }
            Collections.sort(list);
            
            if(list.size() > 0){
                max = list.get(list.size()-1);
            }
            if (num - max <= max) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
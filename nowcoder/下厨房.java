import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Main {
   

public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
                 List<String> arrlist = new ArrayList<>();

      /*  while(sc.hasNext()){
            String str = sc.nextLine();
            String[] s = str.split(" ");*/
            while (true) {
            String str = sc.nextLine();
            if (str == null || str.trim().length() == 0) {
                break;
            }
            String[] s = str.split(" ");
            for (String st : s) {
                if (arrlist.remove(st)) {
                    arrlist.add(st);
                } else {
                    arrlist.add(st);
                }
            }
        }
         
        System.out.println(arrlist.size());
        //set.clear();
    }
}

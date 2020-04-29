import org.w3c.dom.ls.LSOutput;

import java.util.Enumeration;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int n = sc.nextInt();
            sc.nextLine();
            System.out.print(fun(n)+" ");
            System.out.println(fun(n*n));
        }
    }

    private static int fun(int n) {
        int m = 0;
        while(n != 0){
            m += n % 10;
            n = n / 10;
        }
        return m;
    }


}

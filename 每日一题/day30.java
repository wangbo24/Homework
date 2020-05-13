import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] w = {17*29,29,1};
        String[] p = sc.next().split("\\.");
        String[] a = sc.next().split("\\.");
        sc.nextLine();
        int[] A = {Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2])};
        int[] P = {Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2])};
        int r = (P[0]-A[0])*w[0] + (P[1]-A[1])*w[1] + (P[2]-A[2])*w[2];
        int i = 0;
        if(r < 0){
            r = Math.abs(r);
            System.out.print("-");
        }
        System.out.println(r/w[0]+"."+r%w[0]/w[1]+"."+r%w[0]%w[1]/w[2]);
    }
}

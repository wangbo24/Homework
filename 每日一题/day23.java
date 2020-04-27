import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        sc.hasNext();
        int i = 0;
        int length  = 0;
        int[] b = new int[length];
        int a = 0;
        while(sc.hasNext()) {
            length = sc.nextInt();
            a = sc.nextInt();
            b = new int[length];

            while (i < length) {
                b[i++] = sc.nextInt();
            }
        }*/
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int i = 0;
            int length = sc.nextInt();
            int[] b = new int[length];
            int a = sc.nextInt();

            while (i < length) {
                b[i++] = sc.nextInt();
            }
            for(int j = 0; j < b.length; j++){
                if(a >= b[j]){
                    a += b[j];
                }else{
                    a += minG(a,b[j]);
                }
            }
            System.out.println(a);
        }

    }

    public static int minG(int a, int b){
        int p = Math.min(a,b);
        while(p > 1){
            if(a % p == 0 && b % p == 0){
                return p;
            }
            p--;
        }
        return 1;
    }
}
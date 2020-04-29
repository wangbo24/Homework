import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double[] score = new double[n];
        int[] credit = new int[n];
        int m = 0;
        for(int i = 0;i < n; i++){
            credit[i] = sc.nextInt();
            System.out.println(credit[i]);
        }
        sc.nextLine();
        for(int i = 0;i < n; i++){
            score[i] = fun(sc.nextInt());
        }
        double creditz = 0;
        for(int i = 0;i < n; i++){
            creditz += credit[i];
        }
        double j = 0;
        for(int i = 0;i < n; i++){
            j += credit[i]*score[i];
        }
        System.out.println(j);
        System.out.println(creditz);
        System.out.println(String.format("%.2f", j/creditz));
    }

    private static double fun(int m) {
        if(100 >= m && m >= 90){
            return 4;
        }
        if(89 >= m && m >= 85){
            return 3.7;
        }
        if(84 >= m && m >= 82){
            return 3.3;
        }
        if(81 > m && m > 78){
            return 3.0;
        }
        if(77 >= m && m >= 75){
            return 2.7;
        }
        if(74 >= m && m >= 72){
            return 2.3;
        }
        if(71 >= m && m >= 68){
            return 2.0;
        }
        if(67 >= m && m >= 64){
            return 1.5;
        }
        if(63 >= m && m >= 60){
            return 1;
        }else{
            return 0;
        }
    }
}

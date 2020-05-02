import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int n = sc.nextInt();
            sc.nextLine();
            int r = 0;
            int i = 1;
            int m = n*n;
            int p = m;
            while(m > r){
                r +=  i*(p % 10);
                i *=10;
                p = p / 10;
                if(n == r){
                    System.out.println("Yes!");
                    break;
                }
            }
            if(n != r){
                System.out.println("No!");
            }
        }
    }
}
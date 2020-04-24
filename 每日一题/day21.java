import java.util.Scanner;
//生兔子问题

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        System.out.println(getNum(month));
    }

    private static int getNum(int month) {
        if(month < 3){
            return 1;
        }
        if(month == 3){
            return 2;
        }
        return getNum(month-1) + getNum(month - 2);
    }

}


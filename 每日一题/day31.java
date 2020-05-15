
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] o = new double[3];
        double[] p = new double[3];
        int i = 0;
        while(i < 3){
            o[i++] = sc.nextDouble();
        }
        i = 0;
        while(i < 3){
            p[i++] = sc.nextDouble();
        }
        sc.nextLine();
        double r = Math.sqrt((p[0]-o[0])*(p[0]-o[0])+(p[1]-o[1])*(p[1]-o[1])+(p[2]-o[2])*(p[2]-o[2]));
        double v = 4*Math.acos(-1)*r*r*r/3;

        System.out.print(String.format("%.3f",r) + " " + String.format("%.3f",v));
    }
}

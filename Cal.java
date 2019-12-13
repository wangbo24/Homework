
import java.util.*;
public class Cal
{
	public static void main(String[] args)
	{
		/*if(args.length==0)
		{
			System.out.println("至少输入一个数");
			return;
		}
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			sum +=Integer.parseInt(args[i]);
		}
		double result=1.0*sum/args.length;
		System.out.println(result);*/
		//String s = args[0];
		
		// switch(s){
			// case "-encoding":
				// System.out.println("用户指定了编码格式");
				// break;
			// case "Run":
				// System.out.println("快跑");
				// break;
			// default:
				// System.out.println("我不知道你在说什么");
		//}
				Scanner sc = new Scanner(System.in);
				while(sc.hasNext()){
					String s = sc.next();
					//String s = sc.nextLine();
					System.out.println(s);
				}
		
	}
}
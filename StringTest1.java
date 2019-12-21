package Packagre;

public class StringTest1 {

	
	public static void main(String[] args) {
		
		String str = "12345王678王39";
		System.out.println("字符串的长度为："+str.length());
		System.out.println("字符串中的第一个字符为："+str.charAt(0));
		System.out.println("字符王第一次出现的位置为："+(str.indexOf('王')+1));
		System.out.println("字符王最后一次出现的位置为："+str.lastIndexOf('王'));
		
		System.out.println(str.indexOf('3'));
		System.out.println(str.lastIndexOf('3'));
		
		String str1 = "201706060424";
		char ch1 = str1.charAt(4);
		char ch2 = str1.charAt(5);
		System.out.println(ch1+""+ch2);
		
		String str3 = "陕西科技大学电智学院";
		System.out.println(str3.replaceAll("","").concat("科技"));
		
		String str4="123@qq.com";
		System.out.println(str4.contains("@"));
		System.out.println(str4.indexOf('@')>=0);
		
	}

}

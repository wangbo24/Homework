package Packagre;

public class StringTest1 {

	
	public static void main(String[] args) {
		
		String str = "12345��678��39";
		System.out.println("�ַ����ĳ���Ϊ��"+str.length());
		System.out.println("�ַ����еĵ�һ���ַ�Ϊ��"+str.charAt(0));
		System.out.println("�ַ�����һ�γ��ֵ�λ��Ϊ��"+(str.indexOf('��')+1));
		System.out.println("�ַ������һ�γ��ֵ�λ��Ϊ��"+str.lastIndexOf('��'));
		
		System.out.println(str.indexOf('3'));
		System.out.println(str.lastIndexOf('3'));
		
		String str1 = "201706060424";
		char ch1 = str1.charAt(4);
		char ch2 = str1.charAt(5);
		System.out.println(ch1+""+ch2);
		
		String str3 = "�����Ƽ���ѧ����ѧԺ";
		System.out.println(str3.replaceAll("","").concat("�Ƽ�"));
		
		String str4="123@qq.com";
		System.out.println(str4.contains("@"));
		System.out.println(str4.indexOf('@')>=0);
		
	}

}

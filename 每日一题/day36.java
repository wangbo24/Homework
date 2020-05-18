public class Demo1 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.print(conversion(str)+"");
        }
    }
    public static long conversion(String str){
        String[] st = str.split("0x");
        String s = st[1];
        long l = 0;
        int j = 0;
        int n = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'F'){
                n = s.charAt(i) - 'A' + 10;
            }else{
                n = s.charAt(i) - '0';
            }
            l += n*Math.pow(16,j++);
        }
        return l;
    }
}
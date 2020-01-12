public static void main(String[] args) {
        int a = 9;
        int b = 6;

        System.out.println(a+b+""+(a+b)+b);
        System.out.println(a+""+b);
        System.out.println(a+(b+1));
        System.out.println("******************");
        mystery(1234);
        System.out.println(toLowerCase("asd"));
    }
    public static void mystery(int x){
        System.out.println(x%10);
        if((x/10) != 0){
            mystery(x/10);
        }
        System.out.println(x%10);
    }
    public static String toLowerCase(String str) {
        for(char ch : str.toCharArray()){
            ch = ch - r;
            System.out.print(ch);
        }
        return str;
    }
public class Substr {
    public static void main(String[] args) {
        String[] p = {"a","b","c","d"};
        int n = 4;
        String s = "abc";

        boolean[] b = SubStr(p,n, s);
        for(boolean f : b) {
            System.out.println(f);
        }
    }
    public static boolean[] SubStr(String[] p, int n, String s) {
        boolean[] result = new boolean[n];
        // write code here
        int i = 0;
        for(String str : p){
            if(isSon(str,s)){
                result[i] = true;
            }else{
                result[i] = false;
            }
            i++;
        }
        return result;
    }

    private static boolean isSon(String str, String s) {
        int a = s.indexOf(str);
        if(a != -1){
            return true;
        }
        return false;
    }
}
public static int reverse(int x) {
        Stack<Character> stack = new Stack<>();
        String a = x + "";
        String pro = "";
        boolean t = true;
        for(char c : a.toCharArray()){
            if(c == '-'){
              t = false;
              continue;
            }
            stack.push(c);
        }
        while(!stack.isEmpty()){
            pro = pro + stack.pop();
        }
        int n;
        try {
            n = Integer.parseInt(pro);
        }catch(Exception e){
            return 0;
        }
        if(t == false){
            return -n;
        }
        return n;
    }*/


    public int reverse(int x) {
        /**
        ret 保存旧的翻转中间值, temp 保存新的翻转过程中间值
        依次提取 x 的末位加入 temp, 如果发生溢出则通过temp/10 
        无法得到上一轮的翻转结果 ret
        **/
        int ret = 0;
        int temp = 0;
        while(x != 0) {
            temp = ret*10 + x%10;
            if(temp / 10 != ret)
                return 0;
            ret = temp;
            x /= 10;
        }
        return ret;
import  java.util.Stack;
public class MatchDemo {

        public boolean isValid(String s) {
            final char[][] array = {{'(', ')'},
                    {'[', ']'}, {'{', '}'}};
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < s.length(); ++i) {
                char curCh = s.charAt(i);
                int flag = 0;
                for(int j = 0; j < array.length; ++j) {
                    //左括号： 入栈
                    if(curCh == array[j][0]){
                        st.push(curCh);
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0) {
                    //右括号
                    //获取栈顶元素
                    if(st.isEmpty())
                        return false;
                    char topCh = st.pop();
                    //确定栈顶元素是哪一个左括号
                    for(int k = 0; k < array.length; ++k) {
                        //确定了左括号
                        if(topCh == array[k][0]) {
                            //判断当前的右括号是否和左括号匹配
                            if(curCh == array[k][1]) {
                                break;
                            }
                            else {
                                return false;
                            }
                        }
                    }
                }
            }
            //判断栈是否为空
            return st.isEmpty();
        }
}

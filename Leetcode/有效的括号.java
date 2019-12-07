public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[][] Arr={{'(',')'},{'[',']'},{'{','}'}};
        for(char c : s.toCharArray()){
            int flag = 0;
            for(int i = 0;i < 3;i++){
                if(c == Arr[i][0]){
                    stack.push(c);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                if(stack.isEmpty()){
                    return false;
                }else{
                    char topch = stack.pop();
                    for(int i = 0; i < 3; i++){
                        if(c == Arr[i][1]){
                            if(Arr[i][0] == topch) {
                                break;
                            }
                            else{
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return stack.isEmpty();        
    }
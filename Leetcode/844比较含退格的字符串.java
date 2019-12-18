public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(char c : T.toCharArray()){
            if(c == '#'){
                if(stack1.isEmpty()){
                    continue;
                }
                stack1.pop();
            }else {
                stack1.push(c);
            }
        }
        for(char c : S.toCharArray()){
            if(c == '#'){
                if (stack2.isEmpty()) {
                    continue;
                }
                stack2.pop();
            }else{
                stack2.push(c);
            }
        }
        
        return stack1.equals(stack2);
    }
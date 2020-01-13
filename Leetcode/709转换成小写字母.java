public static String toLowerCase(String str) {
        StringBuilder st = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if( 65 <= c && c <= 90) {
                c += 32;
            }
            st.append(c);
        }
        return st.toString();
    }
public boolean hasAlternatingBits(int n) {
        int m = n;
        while(m != 0){
            int prev = m & 1;
            m = m>>1;
            if((m & 1) == prev){
                return false;
            }
        }
        return true;
    }
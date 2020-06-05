class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(Character ch : J.toCharArray()){
            set.add(ch);
        }
        int count = 0;
        for(char ch : S.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
class EntryComparator implements Comparator<Map.Entry<String,Integer>>{
    @Override
    public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
       int t = o1.getValue() - o2.getValue();
       if(t == 0){
           return o2.getKey().compareTo(o1.getKey());
       }
       return t; 
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0) + 1);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(new EntryComparator());
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
            
        }
        
        LinkedList<String> list = new LinkedList<>();
        while(!pq.isEmpty()){
            String str = pq.poll().getKey();
            list.addFirst(str);
        }
        return list;
    }
}
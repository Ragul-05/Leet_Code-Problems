class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> c = new HashMap<>();
        for(char d : s.toCharArray()){
            c.put(d,c.getOrDefault(d,0)+1);
        } 

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> (c.get(b)-c.get(a)));
        for(char key : c.keySet()){
            maxHeap.add(key);
        }

        StringBuilder sb = new StringBuilder();
        while(maxHeap.size() > 0){
            char a = maxHeap.poll();
            for(int i = 0;i < c.get(a); i++){
                sb.append(a);
                
            }
        }
        return sb.toString();
    }
}
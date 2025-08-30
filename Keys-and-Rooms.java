public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        q.offer(0);       
        visited[0] = true;
        int c = 0;         
        while (!q.isEmpty()) {
            int e = q.poll();   
            c++;
            for (int i : rooms.get(e)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
        return c == n; 
    }
}
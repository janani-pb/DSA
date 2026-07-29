// import java.util.*;

class Solution {
    public int[][] merge(int[][] g) {
        int n = g.length;
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < n; i++){
            adj.put(i, new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (g[i][0] <= g[j][1] && g[j][0] <= g[i][1]) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean[] v = new boolean[n];
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!v[i]) {
                List<Integer> c = new ArrayList<>();
                dfs(i, adj, v, c);
                int s = Integer.MAX_VALUE, e = Integer.MIN_VALUE;
                for (int x : c) {
                    s = Math.min(s, g[x][0]);
                    e = Math.max(e, g[x][1]);
                }
                res.add(new int[]{s, e});
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    private void dfs(int u, Map<Integer, List<Integer>> adj, boolean[] v, List<Integer> c) {
        v[u] = true;
        c.add(u);
        for (int nxt : adj.get(u)) {
            if (!v[nxt]) dfs(nxt, adj, v, c);
        }
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, i, j, 2, n, m);
                }
            }
        }
        int minutes = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    return -1; 
                }
                if (grid[i][j] > 2) {
                    minutes = Math.max(minutes, grid[i][j] - 2);
                }
            }
        }
        
        return minutes;
    }
    
    private void dfs(int[][] grid, int r, int c, int time, int n, int m) {
        if (r < 0 || r >= n || c < 0 || c >= m || grid[r][c] == 0) {
            return;
        }
        if (grid[r][c] > 1 && grid[r][c] < time) {
            return;
        }
        grid[r][c] = time;
        dfs(grid, r + 1, c, time + 1, n, m);
        dfs(grid, r - 1, c, time + 1, n, m);
        dfs(grid, r, c + 1, time + 1, n, m);
        dfs(grid, r, c - 1, time + 1, n, m);
    }
}

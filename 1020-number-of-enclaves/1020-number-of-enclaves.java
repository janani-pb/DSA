import java.util.Queue;
import java.util.LinkedList;

class Solution {
    class pair{
        int row;
        int col;
        pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int numEnclaves(int[][] grid) {
        int row=grid.length;
        int col =grid[0].length;
        Queue<pair> q = new LinkedList<>();
        boolean [][] visited=new boolean[row][col];

        for(int i=0;i<col;i++){
            if(grid[0][i]==1){
                q.offer(new pair(0,i));
                visited[0][i]=true;
            }
            if(grid[row-1][i]==1){
                q.offer(new pair(row-1,i));
                visited[row-1][i]=true;
            }
        }
        
        for(int j=0;j<row;j++){
            if(grid[j][0]==1 && !visited[j][0]){
                q.offer(new pair(j,0));
                visited[j][0]=true;
            }
            if(grid[j][col-1]==1 && !visited[j][col-1]){
                q.offer(new pair(j,col-1));
                visited[j][col-1]=true;
            }
        }

        int[]drow={-1,1,0,0};
        int[]dcol={0,0,1,-1};
        while(!q.isEmpty()){
            pair current=q.poll();
            int rrow=current.row;
            int rcol=current.col;
            for(int i=0;i<4;i++){
                int ro=rrow+drow[i];
                int co=rcol+dcol[i];
                if(ro>=0 && co>=0 && ro<row && co<col && grid[ro][co]==1 && !visited[ro][co]){
                    visited[ro][co]=true;
                    q.offer(new pair(ro,co));
                }
            }
        }
    
        int c=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    c++;
                }
            }
        }
        return c;
    }
}

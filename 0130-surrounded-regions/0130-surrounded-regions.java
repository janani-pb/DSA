class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        Queue<Pair> q = new LinkedList<>();
        boolean [][] visited=new boolean[row][col];
        for(int j=0;j<col;j++){
            if(board[0][j]=='O'){
                board[0][j]='#';
                q.offer(new Pair(0,j));
                visited[0][j]=true;
            }
            if(board[row-1][j]=='O'){
                board[row-1][j]='#';
                q.offer(new Pair(row-1,j));
                visited[row-1][j]=true;
            }
        }
        for(int i=0;i<row;i++){
            if(board[i][0]=='O'){
                board[i][0]='#';
                q.offer(new Pair(i,0));
                visited[i][0]=true;
            }
            if(board[i][col-1]=='O'){
                board[i][col-1]='#';
                q.offer(new Pair(i,col-1));
                visited[i][col-1]=true;
            }
        }
        int[] drow={-1,1,0,0};
        int[] dcol={0,0,1,-1};
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int rrow=curr.row;
            int rcol=curr.col;
            for(int i=0;i<4;i++){
                int ro=rrow+drow[i];
                int co=rcol+dcol[i];
                if(ro>=0 && co>=0 && ro<row && co<col && !visited[ro][co] && board[ro][co]=='O'){
                    board[ro][co]='#';
                    visited[ro][co]=true;
                    q.offer(new Pair(ro,co));
                }
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }
            if(board[i][j]=='#'){
                board[i][j]='O';
            }
        }
    }
    }
}
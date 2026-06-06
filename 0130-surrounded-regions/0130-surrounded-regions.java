class Solution {
    public void solve(char[][] board) {
        int c=0;
        int row = board.length;
        int col = board[0].length;
        for(int j=0;j<col;j++){
            if(board[0][j]=='O'){
                dfs(board,0,j,row,col);
            }
            if(board[row-1][j]=='O'){
                dfs(board,row-1,j,row,col);
            }
        }
        for(int i=0;i<row;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0,row,col);
            }
            if(board[i][col-1]=='O'){
                dfs(board,i,col-1,row,col);
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
    public void dfs(char[][] board,int i,int j,int row,int col){
        if(i<0 || j<0 || i>=row || j>=col || board[i][j]!='O'){
            return;
        }
        board[i][j]='#';
        dfs(board,i-1,j,row,col);
        dfs(board,i+1,j,row,col);
        dfs(board,i,j-1,row,col);
        dfs(board,i,j+1,row,col);
    }
}
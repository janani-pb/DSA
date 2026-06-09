class Solution {
    public List<List<String>> solveNQueens(int n) {
        ArrayList<List<String>> al = new ArrayList<>();
        char[][] q = new char[n][n];
        for(int i=0;i<q.length;i++){
            Arrays.fill(q[i],'.');
        }
        solveuntil(q,al,0);
        return al;
    }

    public boolean isvalid(char[][]q,int row,int col){
        //left check
        for(int i=col-1;i>=0;i--){
            if(q[row][i]=='Q'){
                return false;
            }
        }
        //top left check
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(q[i][j]=='Q'){
                return false;
            }
        }
        //bottom left diagonal
        for(int i=row+1,j=col-1;i<q.length&&j>=0;i++,j--){
            if(q[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    
    public void solveuntil(char[][]q,ArrayList<List<String>>al,int index){
        if(index==q.length){
            ArrayList<String> temp=new ArrayList<>();
            for(int i=0;i<q.length;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<q.length;j++){
                    sb.append(q[i][j]);
                }
                temp.add(sb.toString());
            }
            al.add(temp);
            return;
        }
        for(int i=0;i<q.length;i++){
            if(isvalid(q,i,index)){
                q[i][index]='Q';
                solveuntil(q,al,index+1);
                q[i][index]='.';
            }
        }
    }
}
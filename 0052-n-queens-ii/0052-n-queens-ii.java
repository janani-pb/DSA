class Solution {
    public int totalNQueens(int n) {
        ArrayList<List<String>> al = new ArrayList<>();
        char[][] q = new char[n][n];
        for(int i=0;i<q.length;i++){
            Arrays.fill(q[i],'.');
        }
        solve(q,al,0);
        return al.size();
    }
    public boolean isvalid(char[][] q ,int row , int col){
        for(int i=col-1;i>=0;i--){
            if(q[row][i]=='Q'){
                return false;
            }
        }
        for(int i=row-1 , j = col-1 ;i>=0 && j>=0;i--,j--){
            if(q[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row+1,j=col-1;i<q.length&&j>=0;i++,j--){
            if(q[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public  void solve(char[][] q,ArrayList<List<String>> al , int index){
        if(index==q.length){
            ArrayList<String> l = new ArrayList<>();
            for(int i=0;i<q.length;i++){
                StringBuilder s= new StringBuilder();
                for(int j=0;j<q.length;j++){
                    s.append(q[i][j]);
                }
                l.add(s.toString());
            }
            al.add(l);
            return;
        }
        for(int i=0;i<q.length;i++){
            if(isvalid(q,i,index)){
                q[i][index]='Q';
                solve(q,al,index+1);
                q[i][index]='.';
            }
        }
    }
}
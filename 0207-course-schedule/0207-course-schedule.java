class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        int [] indegree=new int[numCourses];
        for(int [] num:prerequisites){
            int u=num[0];
            int v=num[1];
            l.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            int n = q.poll();
            c++;
            for(int nbr:l.get(n)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        return c==numCourses;
    }
}

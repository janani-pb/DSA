class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        int [] indegree=new int[numCourses];
        for(int [] num:prerequisites){
            int u=num[0];
            int v=num[1];
            l.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] course=new int[numCourses];
        int index=0;
        while(!q.isEmpty()){
            int n = q.poll();
            course[index++]=n;
            for(int nbr:l.get(n)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                q.add(nbr);
            }
            }
        }
        return index==numCourses ? course : new int[0];
    }
}
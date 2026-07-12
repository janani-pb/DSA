class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] a = arr.clone();
        Arrays.sort(a);
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : a){
            map.putIfAbsent(num,map.size()+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character,Integer> map = new HashMap<> ();
        for (char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap <Character,Integer> hm = new HashMap<> ();
        for (char j:t.toCharArray()){
            hm.put(j,hm.getOrDefault(j,0)+1);
        }
        return map.equals(hm);
    }
}
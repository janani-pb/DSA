class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for(List<String> k : knowledge){
            map.put(k.get(0),k.get(1));
        }
        StringBuilder res = new StringBuilder();
        StringBuilder key = new StringBuilder();
        boolean eva=false;
        for(char c : s.toCharArray()){
            if(c == '('){
                eva=true;
            }
            else if(c==')'){
                eva=false;
                res.append(map.getOrDefault(key.toString(),"?"));
                key.setLength(0);
            }
            else if (eva){
                key.append(c);
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
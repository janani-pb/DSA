class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
            for(int i=0;i<s.length();i++){
                char op=s.charAt(i);
                if(op =='('||op =='{'||op =='['){
                    st.push(op);
                }
                else {
                    if(st.isEmpty()) return false;
                    if((op==')' && !st.isEmpty() && st.peek()=='(') || (op=='}' && !st.isEmpty() && st.peek()=='{') || (op==']' && !st.isEmpty() && st.peek()=='[')){
                    st.pop();
                }
                else {
                    return false;
                }
                
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
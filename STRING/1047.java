class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char a:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==a){
                st.pop();
            }
            else{
            st.push(a);
            }
        } 
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}
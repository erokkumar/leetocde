class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        st.push(new StringBuilder());
        //StringBuilder sc = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(new StringBuilder());
            }else if(ch == ')'){
                StringBuilder str = st.pop();
                str.reverse();
                st.peek().append(str);
            }else{
                st.peek().append(ch);
            }
        }return st.pop().toString();
    }
}
// uevoli
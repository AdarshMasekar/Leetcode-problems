class Solution {
   public boolean backspaceCompare(String s, String t) {
    
    Stack<Character> st = new Stack<>();
    Stack<Character> tt = new Stack<>();
    
    for(int i = 0;i< s.length();i++){
        if(s.charAt(i) == '#'){
            if(!st.empty()) st.pop();   
        }
        else{
            st.push(s.charAt(i));
        }
    }
    
    for(int i = 0;i< t.length();i++){
        if(t.charAt(i) == '#'){
            if(!tt.empty()) tt.pop();
        }
        else{    
            tt.push(t.charAt(i));        
        }
    }
    
    while(!st.empty() && !tt.empty()) {
        if(st.peek() == tt.peek()){
            st.pop(); 
            tt.pop();
        }
        else{
            return false;
        }
    }
    
    return st.empty() && tt.empty();
}
}

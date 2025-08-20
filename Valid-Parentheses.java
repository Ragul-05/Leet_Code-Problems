class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] stack = new char[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } 
            else {
                if (top != -1 && isPair(stack[top], c)) {
                    top--; 
                } else {
                    return false;
                }
            }
        }
        return top == -1;
    }
    private boolean isPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}

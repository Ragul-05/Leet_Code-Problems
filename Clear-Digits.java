class Solution {
    public String clearDigits(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (char ch : s.toCharArray()) {
            int digit = ch - '0';
            if (digit >= 0 && digit <= 9) {
                if (top >= 0) top--;
            } else {
                stack[++top] = ch;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(stack[i]);
        }
        return sb.toString();
    }
}

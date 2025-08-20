class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int[] stack = new int[n];
        int top = -1;
        for(int i = 0; i < n; i++) {
            if(!operations[i].equals("+") && !operations[i].equals("C") && !operations[i].equals("D")) {
                int digit = Integer.parseInt(operations[i]);
                stack[++top] = digit;
            }
            else {
                if(operations[i].equals("+")) {
                    int temp = stack[top] + stack[top - 1];
                    stack[++top] = temp;
                } else if(operations[i].equals("D")) {
                    int temp = stack[top] * 2;
                    stack[++top] = temp;
                } else if(operations[i].equals("C")) 
                    top--;
            }
        }
        int sum = 0;
        if(top == -1)
            return sum;
        
        for(int i = top; i >= 0; i--)
            sum += stack[i];

        return sum; 
    }
}
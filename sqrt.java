package Leet_Code_Problems;
class Solution {
    public int mySqrt(int x) {
        if(x ==0 || x==1){
            return x;
        }
        int left = 1 ,right = x/2,answer =0;
        while(left <= right){
            int mid = left + (right -left)/2 ;

            long sqrt = (long) mid * mid; 
            
            if (sqrt == x){
                return mid;
            }
            else if(sqrt < x){
                answer = mid ;
                left =mid +1 ;
            }
            else {
                right = mid-1;
            }
        
        }
        return answer ;
    }
}
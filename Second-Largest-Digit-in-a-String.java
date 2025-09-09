class Solution {
    public int secondHighest(String s) {
        int largest = -1,secondLargest = -1;
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            if(!Character.isLetter(s.charAt(i))){
                int digit = s.charAt(i) - '0';
                if(digit > largest){
                    secondLargest = largest;
                    largest = digit;
                }
                else if(digit < largest && digit > secondLargest){
                    secondLargest = digit;
                }
            }
        }
        return secondLargest;
    }
}
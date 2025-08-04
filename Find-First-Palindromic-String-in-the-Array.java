class Solution {
    public String firstPalindrome(String[] words) {
        for(String str : words){
            if(isPalindrome(str)){
                return str;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String str1){
        int left = 0,right = str1.length()-1;
        while(left < right){
            if(str1.charAt(left++) != str1.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
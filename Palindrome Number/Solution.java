class Solution {
    public boolean isPalindrome(int x) {
        char[] temp = String.valueOf(x).toCharArray();
        int len = String.valueOf(x).length();
        int n = len / 2;
        
        for (int i = 0; i < n; i++) {
            if(temp[i] != temp[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
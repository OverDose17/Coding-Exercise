class Solution {
    public static int lengthOfLongestSubstring(String s) {
        
        int res = 0;
        int count = 0;
        char c = ' ';
        char[] s_temp = s.toCharArray();
        boolean flag = true;
        int j = 0;
        char temp = ' ';
        // if (s.length() == 1) {
        //     res = 1;
        // }
        for (int i = 0; i < s.length(); i = i + 1) {
            // 
            temp = s_temp[i];
            count = 1;
            j = i + 1;
            while (j < s.length()){
                
                if (temp >= s_temp[j]) {
                    
                    if (count >= res) {
                        res = count;
                        c = temp;
                        System.out.println(s_temp[j] +""+ j);
                        flag = false;
                    }
                    break;
                }
                count++;
                j++;
                
                
            }
            
        }System.out.println(flag);
        if (flag) {
            System.out.println("hello");
            res = s.length();
            // c = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
        int length = needle.length(); 
        if (length == 0 || haystack.equals(needle)) return 0; 
        else{
            String temp = ""; 
            for (int i = 0; i < haystack.length() - length + 1; i++){
                temp = haystack.substring(i, i+length); 
                if (temp.equals(needle)) return i; 
            }
        }
        
        return -1; 
        
    }
}

//==>Time complexity O(n)
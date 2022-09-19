class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int first=0;
        int last=0;
        int n = s.length();
        int len =0;
        
        while(first<n){
            
        if(map.containsKey(s.charAt(first))){
            last = Math.max(map.get(s.charAt(first))+1, last);
            }
            
            map.put(s.charAt(first),first);
            len = Math.max(len , first-last +1);
            first++;
        }
        return len;
    }
}
        
 //==>Time complexity o(n)   
 //==>space complexity o(n)   
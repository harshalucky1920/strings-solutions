class Solution {
    Map<Character, char[]> map = new HashMap<>();
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return ans;
        }
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[] {'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        backtrack(digits, 0, "");
        return ans;
    }
    private void backtrack(String digits, int index, String curr) {
        if (curr.length() == digits.length()) {
            ans.add(curr);
            return;
        }
        char[] array = map.get(digits.charAt(index));
        for (char ch : array) {
            backtrack(digits, index + 1, curr + ch);
        }
    }
}

//==>Time complexity O(4^n)
//==>space complexity o(n)
class Solution {
    public int countValidWords(String sentence) {
         if(sentence.length() == 0){
		return 0;
	}
	sentence = sentence.trim();
	String[] s = sentence.split("\\s+");
    
    int count = 0;
    
    for(int i = 0; i < s.length; i++){
        System.out.println(s[i]);
        if(isWords(s[i])){
            count++;
        }
    }
    
    return count;
}

public boolean isWords(String s){
    int counterHy = 0;
    
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        
        if(Character.isDigit(c)){
            return false;
        }
        
       if(Character.isLowerCase(c)){
            continue;
        }
        
        if(c == '-'){
            counterHy++;
            if(counterHy > 1){
                return false;
            }
            
            if(i - 1 < 0 || i + 1 > s.length() - 1
               || !(Character.isLowerCase(s.charAt(i - 1)) &&Character.isLowerCase(s.charAt(i + 1)))){
                return false;
            }
        }else if(i != s.length() - 1){
            return false;
        }
    }
    
    return true;
 }
}

//==>Time complexity o(n)
//==>space complexity o(1)
    
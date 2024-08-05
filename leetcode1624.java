import java.util.Hashtable;

class Solution {

    // create a hashtable, set maxLen to record and update maximum lenght
    // iterate through the string, if the character is already in the table, then calculate the length of the substring and update the maxlen if neccessary
    // if the character is not in the table yet, then put it on the table and put the current index as the value
    // after iterating through string, return the maxLen

  
    public int maxLengthBetweenEqualCharacters(String s) {
        
        Hashtable<Character, Integer> table = new Hashtable<>();

        char curKey;
        int maxLen = -1;

        for (int i = 0; i < s.length(); i++){
            curKey = s.charAt(i);
            if (table.containsKey(curKey)){
                int length = i - table.get(curKey) - 1;
                if (length > maxLen){
                    maxLen = length;
                }
            } else {
                table.put(curKey, i);
            }
        }
        
        return maxLen;
    }
}

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Map<Character, Integer> table = new HashMap<Character, Integer>();

        for(int i = 0; i < sentence.length(); i++){
            if (table.containsKey(sentence.charAt(i))){
                // increment the value by one
                table.put(sentence.charAt(i), table.get(sentence.charAt(i)) + 1);
            }
            else {
                table.put(sentence.charAt(i), 1);
            }
        }
        return table.size() == 26;
    }
}

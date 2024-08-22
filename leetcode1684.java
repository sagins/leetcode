class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        // the approach is that first we assume that every word in the array is consistent
        // we then go through each word to make sure whetehr they only include from the allowed words
        // if not we decrement from the consistent variable
        // at the end we return the number of consistent words.
        
        int consistent = words.length;

        for (String word: words){
            for (char letter: word.toCharArray()){
                if (!allowed.contains(Character.toString(letter))){
                    consistent--;
                    break;
                }
            }
        }
        return consistent;

    }
}

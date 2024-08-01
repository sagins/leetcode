class Solution {


  // iterate through the string, whenever the current element is x increment the numMoves and skip the next 3 elements
  // if at the end of the string, then break out of the loop and return moves


  
    public int minimumMoves(String s) {

        int numMoves = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'X'){
                numMoves++;
                if (i + 3 < s.length()){
                    i += 2;
                }
                else {
                    break;
                }
            }
        }
        return numMoves;

    }
}





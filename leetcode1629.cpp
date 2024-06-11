class Solution {
public:


    // loop through the releaseTimes vector 
    // if the current element is the first element, set cur to the current element
    // otherwise, set cur to the difference between the current element and the previous element
    // if cur is greater than longest, set longest to cur and set longestChar to the current character
    // if cur is equal to longest, compare the current character to longestChar and set longestChar to the greater character
    // return  longestChar



    char slowestKey(vector<int>& releaseTimes, string keysPressed) {
        int cur = 0;
        char curChar;
        int longest = 0;
        char longestChar;
        

        for (int i = 0; i < releaseTimes.size(); i++){
            if (i == 0){
                cur = releaseTimes[i];
                curChar = keysPressed[i];
            }
            else{
                cur = releaseTimes[i] - releaseTimes[i-1];
                curChar = keysPressed[i];
            }
            if (cur > longest){
                longest = cur; 
                longestChar = keysPressed[i];
            } 
            else if (cur == longest){
                if (curChar > longestChar){
                    longestChar = curChar;
                }
            }
        }
        return longestChar;
    }
};

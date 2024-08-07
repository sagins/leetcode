class Solution {

    // iterate through the nums array using nested for loops to check for good pairs
    // check for the good pair condition using nums[i] == nums[j] && i < j
    // if good pair then increment pairs by one
    // at the end return the pairs variable

    public int numIdenticalPairs(int[] nums) {
        
        int pairs = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j] && i < j){
                    pairs++;
                }
            }
        }
        return pairs;

    }
}

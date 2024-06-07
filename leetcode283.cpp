class Solution {
public:

    // start looping through the array
    // if the current element is 0, loop through the rest of the array
    // if the next element is not 0, swap the two elements
    // break the loop
    void moveZeroes(vector<int>& nums) {

        for (int i = 0; i < nums.size(); i++){
            if (nums[i] == 0) {
                for (int j = i; j < nums.size(); j++){
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
};

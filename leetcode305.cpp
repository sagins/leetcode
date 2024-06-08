class Solution {
public:

    // loop through the first array
    // for each element, loop through the second array to find a match
    // if a match is found, add the element to the output vector and mark the element in the second array as -1
    // return the output vector
    

    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> output;
       
        for (int i = 0; i < nums1.size(); i++){
            for (int j = 0; j < nums2.size(); j++){
                if (nums1[i] == nums2[j]){
                    output.push_back(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }    
        return output;
    }
};
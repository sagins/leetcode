class Solution {
public:

    // set two pointers called low and high to the first and last elements of the array
    // loop through the array
    // calculate the area of the rectangle formed by the two pointers
    // if the area is greater than the maximum area, update the maximum area
    // if the height of the high pointer is greater than the height of the low pointer, increment the low pointer
    // otherwise, decrement the high pointer
    // return the maximum area
    int maxArea(vector<int>& height) {

        int max = 0;
        int cur = 0;
        int low = 0;
        int high = height.size()-1;

        for (int i = 0; i < height.size(); i++){

            if (high == low){
                break;
            }

            cur = (min(height[low],height[high]) * (high - low));

            if (cur > max){
                max = cur;
            }
        
            if (height[high] > height[low]){
                low++;
            }
            else { 
                high--;
            }
        }

        return max;
    }

};
class Solution {

    // Leetcode #1460
    // sort each array and then compare whether the two are equal


    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i = 0; i < target.length; i++){
            if (target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }
}

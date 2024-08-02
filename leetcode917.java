class Solution {

    // use string builder because strings are immutable
    // use two pointers called left and right
    // loop when left is less than right
    // if the current left or right  is not an English letter, increment left or decrement right
    // when both are English letters make the swap
    // at the end return the string


  
    public String reverseOnlyLetters(String s) {

        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (!Character.isLetter(sb.charAt(left))) {
                left++;
            } 
            else if (!Character.isLetter(sb.charAt(right))) {
                right--;
            }
            else {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
        }
        return sb.toString();
    }
}

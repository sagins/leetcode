class Solution {
    public String reverseWords(String s) {
        // Convert the string to a char array to allow modification
        char[] str = s.toCharArray();
        int low = 0;

        for (int i = 0; i <= str.length; i++) {
            if (i == str.length || str[i] == ' ') {
                int top = i - 1;
                // Reverse the characters in the current word
                while (low < top) {
                    char temp = str[low];
                    str[low] = str[top];
                    str[top] = temp;
                    low++;
                    top--;
                }
                low = i + 1;
            }
        }
        // Convert the char array back to a string and return it
        return new String(str);
    }
}

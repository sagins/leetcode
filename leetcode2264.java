class Solution {
    public String largestGoodInteger(String num) {
        
        int length = 0;
        String cur = "";
        String output = "";

        // loop through the string until n-1
        // if the current char is equal to the char at i+1 then append it to the cur string and increase length
        // to avoid adding extra, when len is equal to two, append ith char to cur.
        // if cur is greater than output, update output
        // return output


        for (int i = 0; i < num.length() - 1; i++){
            
            if (num.charAt(i) == num.charAt(i + 1)){
                cur += num.charAt(i);
                length++;
                if (length == 2){

                    cur += num.charAt(i);
 
                    if (cur.compareTo(output) > 0){
                        output = cur;
                    }
                }
            }
            else {
                cur = "";
                length = 0;
            }
        }
        return output;

    }
}
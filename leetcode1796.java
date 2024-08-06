class Solution {

  // iterate through the string
  // if current char is a digit, see if it is higher than the current hightest
  // if so update the highest and second highest
  // otherwise check if it is not equal to hightest and also greater than the second highest
  // if so than update the second highest
  // return the second highest

  
    public int secondHighest(String s) {

        int highest = -1;
        int secHighest = -1;
        
        for (int i = 0; i < s.length(); i++){
            
            if (Character.isDigit(s.charAt(i))){

                int digit = s.charAt(i) - '0';
                if (digit > highest){
                    secHighest = highest;
                    highest = digit;
                }
                else if (digit != highest && digit > secHighest){
                    secHighest = digit;
                }

            }
        }
        return secHighest;

    }
}

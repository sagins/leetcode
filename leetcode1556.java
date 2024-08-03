class Solution {
    public String thousandSeparator(int n) {


      // use a stringbuilder to convert the integer give to string
      // start iterating from the back of the string and at every 3 iteration, insert a dot to the current index
      // stop iterating when i > 0
      // return the string

        StringBuilder str = new StringBuilder();
        str.append(String.valueOf(n));
    
        int counter = 1;

        for (int i = str.length()-1; i > 0; i--){
            if (counter == 3){
                str.insert(i, ".");
                counter = 0;
            }
            counter++;
        }
        return str.toString();
    }
}

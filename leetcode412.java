class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> output = new ArrayList<String>();

        for (int i = 1; i <= n; i++){

            if (i % 3 == 0 && i % 5 == 0){
                // FizzBuzz case
                output.add("FizzBuzz");
            }
            else if (i % 5 == 0){
                // Buzz case
                output.add("Buzz");
            }
            else if (i % 3 == 0){
                // Fizz case
                output.add("Fizz");
            }
            else {
                // just add the number case
                output.add(String.valueOf(i));
            }


        }

        return output;

    }
}

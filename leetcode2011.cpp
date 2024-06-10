class Solution {
public:

    // loop through the operations vector
    // if the first or second character of the string is '+', increment x
    // otherwise, decrement x
    // return x


    int finalValueAfterOperations(vector<string>& operations) {
        int x = 0;

        for (int i = 0; i < operations.size(); i++){
            if (operations[i][0] == '+' || operations[i][1] == '+'){
                x++;
            }
            else if (operations[i][0] == '-' || operations[i][1] == '-'){
                x--;
            }
        }
        return x;

    }
};
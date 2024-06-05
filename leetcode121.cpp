class Solution {
public:
    int maxProfit(vector<int>& prices) {

        // track the minimum price and the maximum profit
        // for each day, calculate the profit and update the minimum price
        // if the profit is greater than the maximum profit, update the maximum profit
        
        int curProf = 0;
        int profit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.size(); i++){
            curProf = prices[i] - min;
            if (prices[i] < min){
                min = prices[i];
            }
            if (curProf > profit){
                profit = curProf;
            }
        }

        if (profit < 0) return 0;
        return profit;

    }
};
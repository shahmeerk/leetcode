public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currProfit = 0;

        for(int i = 0; i < prices.length; i++){
            currProfit = chooseDay(i, prices);
            profit =  currProfit > profit ? currProfit : profit;
        }
        return profit;
    }

    public int chooseDay(int index, int[] prices){
        int maxProfitForChosenDay = 0;
        for(int i = index + 1; i <= prices.length; i++){
            if(prices[i] > prices[index]){
                maxProfitForChosenDay = (prices[i] - prices[index]) > maxProfitForChosenDay ?
                        prices[i] - prices[index] : maxProfitForChosenDay;
            }
        }
        return maxProfitForChosenDay;
    }

//    public static void main(String args[]){
//        MaxProfit mp = new MaxProfit();
//        int[] prices = {1,2};
//        mp.maxProfit(prices);
//    }
}

public class profit {
    public static void main(String[] args) {
        double cp = 129.0;
        double sp = 191.0;
        double profit = sp - cp;
        double profitPercent = (profit / costPrice) * 100;
        System.out.println("The Cost Price is INR "+ cp +" and Selling Price is INR " + sp + "\n" +
                           "The Profit is INR "+ profit + "and the Profit Percentage is" + profitPercent);
    }
}


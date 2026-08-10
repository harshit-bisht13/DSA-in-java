public class StockBuyAndSell {
    public int stock(int[] arr){
        int n=arr.length;
        int minPrice=arr[0];
        int maxProfit=0;
        for(int x: arr){
            maxProfit=Math.max(maxProfit,x-minPrice);
            minPrice=Math.min(minPrice,x);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        StockBuyAndSell a= new StockBuyAndSell();
        int[] arr={10, 7, 5, 8, 11, 9};
        System.out.println(a.stock(arr));
    }    
}

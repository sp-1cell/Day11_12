package Oops;

import java.util.ArrayList;

public class StockPortfolio {
    private ArrayList<Stock> stockList = new ArrayList<Stock>();

    void addStock(Stock stock) {
        stockList.add(stock);
    }

    void calculateEachStock() {
        for (Stock stock : stockList) {
            System.out.println("Stock Name :" + stock.getStockName() + " ||| Total value of shares Rs.:" + stock.getNoOfShares() * stock.getSharePrice());
        }
    }

    void totalValueStocks() {
        int stocksValue = 0;
        for (Stock stock : stockList) {
            stocksValue += stock.getNoOfShares() * stock.getSharePrice();
        }
        System.out.println("Total value of stocks Rs.:" + stocksValue);
    }

    void infoPortfolio() {
        calculateEachStock();
        totalValueStocks();
    }
}



package Oops;

import java.util.Scanner;

public class Stock {
    private String stockName;
    private static int noOfStock;
    private static int sharePrice;
    private static int noOfShares;

    public static  void setNoOfStock(int noOfStocks) {
        noOfStock = noOfStocks;
    }

    public static int getNoOfStock() {
        return noOfStock;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the stockname");
        stockName = scan.nextLine();
        System.out.println("Enter the number of shares :");
        noOfShares = scan.nextInt();
        System.out.println("Enter the sharePrice");
        sharePrice = scan.nextInt();
    }

    String getStockName() {
        return stockName;
    }

    int getNoOfShares() {
        return noOfShares;
    }

    int getSharePrice() {
        return sharePrice;
    }


    public static void main(String[] args) {

        StockPortfolio portfolio = new StockPortfolio();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of stocks :");
        setNoOfStock(scan.nextInt());
        for (int i = 0; i < getNoOfStock(); i++) {
            Stock stock = new Stock();
            stock.input();
            portfolio.addStock(stock);
        }

        portfolio.infoPortfolio();


    }

}


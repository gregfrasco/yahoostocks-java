package com.gregfrasco.yahoofinanceapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockFetcher {

    /*
     * Returns a Stock Object that contains info about a specified stock.
     * @param 	symbol the company's stock symbol
     * @return 	a stock object containing info about the company's stock
     * @see Stock
     */
    public static Stock getStock(String symbol) {
        try {
            return formatStock(getCSV(symbol).readLine());
        } catch (IOException ex) {
            Logger.getLogger(StockFetcher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Stock[] getStocks(String... symbols) {
        int index = 0;
        Stock[] stocks = new Stock[symbols.length];
        //yahoo api get limit is 200 stocks at one time
        for (int i = 0; i < symbols.length / 200; i++) {
            String[] fetchSymbols;
            if (symbols.length - (i * 200) < 200) {
                //length is smaller than 200
                fetchSymbols = Arrays.copyOfRange(symbols, i * 200, symbols.length-1);
            } else {
                //length is larger than 200
                fetchSymbols = Arrays.copyOfRange(symbols, i * 200, ((i + 1) * 200)-1);
            }
            BufferedReader br = getCSV(convertTocsv(fetchSymbols));
            try {
                String line;
                while ((line = br.readLine()) != null) {
                    stocks[index] = formatStock(line);
                    index += 1;
                }
            } catch (IOException ex) {
            
            }
        }
        return stocks;
    }
    
    private static String convertTocsv(String[] list) {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; list != null && i < list.length; i++) {
            stringBuffer.append(list[i]);
            if (i < list.length - 1) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    private static BufferedReader getCSV(String symbols) {
        try {
            // Retrieve CSV File
            URL yahoo = new URL("http://finance.yahoo.com/d/quotes.csv?s=" + symbols + "&f=l1vrejkghm3j1nc4s7poxabb4c1a5b6a2dd1e7e8e9f6j5j6k3k4k5l1m4m5m6m7m8p2p5p6r1r5r6r7t1yqs");
            URLConnection connection = yahoo.openConnection();
            InputStreamReader is = new InputStreamReader(connection.getInputStream());
            return new BufferedReader(is);
        } catch (MalformedURLException ex) {
            Logger.getLogger(StockFetcher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StockFetcher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static Stock formatStock(String line) {
        String symbol;
        double price;
        double volume;
        double pe;
        double eps;
        double week52low;
        double week52high;
        double daylow;
        double dayhigh;
        double movingavg50day;
        String marketcap;
        String name;
        String currency;
        double shortRatio;
        double open;
        double previousClose;
        String exchange;
        double ask;
        double bid;
        double bookValue;
        double change;
        double askSize;
        double bidSize;
        double avgVolume;
        double dividendYield;
        Date lastTrade;
        double espEstCurYear;
        double espEstNextYear;
        double espEstNextQtr;
        double floatShares;
        double changeYearLow;
        double percentChangeYearLow;
        int lastTradeSize;
        double changeYearHigh;
        double percentChangeYearHigh;
        double lastTradePrice;
        double movingAvg200day;
        double movingAvg50change;
        double movingAvg200change;
        double movingAvg50percent;
        double movingAvg200percent;
        double changePercent;
        double ps;
        double pb;
        Date dividendPayDate;
        double peg;
        double espPriceEstimateCurentYear;
        double espPriceEstimateNextYear;
        double dividendPerShare;
        Date exDividendPayDate;
        //Only split on commas that aren't in quotes
        String[] stockInfo = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        // Handle Our Data
        StockHelper stockHelper = new StockHelper();

        price = stockHelper.handleDouble(stockInfo[0]);
        volume = stockHelper.handleInt(stockInfo[1]);
        pe = stockHelper.handleDouble(stockInfo[2]);
        eps = stockHelper.handleDouble(stockInfo[3]);
        week52low = stockHelper.handleDouble(stockInfo[4]);
        week52high = stockHelper.handleDouble(stockInfo[5]);
        daylow = stockHelper.handleDouble(stockInfo[6]);
        dayhigh = stockHelper.handleDouble(stockInfo[7]);
        movingavg50day = stockHelper.handleDouble(stockInfo[8]);
        marketcap = stockInfo[9].replace("\"", "");
        name = stockInfo[10].replace("\"", "");
        currency = stockInfo[11].replace("\"", "");
        shortRatio = stockHelper.handleDouble(stockInfo[12]);
        previousClose = stockHelper.handleDouble(stockInfo[13]);
        open = stockHelper.handleDouble(stockInfo[14]);
        exchange = stockInfo[15].replace("\"", "");
        ask = stockHelper.handleDouble(stockInfo[16]);
        bid = stockHelper.handleDouble(stockInfo[17]);
        bookValue = stockHelper.handleDouble(stockInfo[18]);
        change = stockHelper.handleDouble(stockInfo[19]);
        askSize = stockHelper.handleDouble(stockInfo[20]);
        bidSize = stockHelper.handleDouble(stockInfo[21]);
        avgVolume = stockHelper.handleDouble(stockInfo[22]);
        dividendPerShare = stockHelper.handleDouble(stockInfo[23]);
        lastTrade = stockHelper.handleDateTime(stockInfo[24] + " " + stockInfo[47]);
        espEstCurYear = stockHelper.handleDouble(stockInfo[25]);
        espEstNextYear = stockHelper.handleDouble(stockInfo[26]);
        espEstNextQtr = stockHelper.handleDouble(stockInfo[27]);
        floatShares = stockHelper.handleDouble(stockInfo[28]);
        changeYearLow = stockHelper.handleDouble(stockInfo[29]);
        percentChangeYearLow = stockHelper.handlePercent(stockInfo[30]);
        lastTradeSize = stockHelper.handleInt(stockInfo[31]);
        changeYearHigh = stockHelper.handleDouble(stockInfo[32]);
        percentChangeYearHigh = stockHelper.handlePercent(stockInfo[33]);
        lastTradePrice = stockHelper.handleDouble(stockInfo[34]);
        movingAvg200day = stockHelper.handleDouble(stockInfo[35]);
        movingAvg200change = stockHelper.handleDouble(stockInfo[36]);
        movingAvg200percent = stockHelper.handlePercent(stockInfo[37]);
        movingAvg50change = stockHelper.handleDouble(stockInfo[38]);
        movingAvg50percent = stockHelper.handlePercent(stockInfo[39]);
        changePercent = stockHelper.handlePercent(stockInfo[40]);
        ps = stockHelper.handleDouble(stockInfo[41]);
        pb = stockHelper.handleDouble(stockInfo[42]);
        dividendPayDate = stockHelper.handleDate(stockInfo[43]);
        peg = stockHelper.handleDouble(stockInfo[44]);
        espPriceEstimateCurentYear = stockHelper.handleDouble(stockInfo[45]);
        espPriceEstimateNextYear = stockHelper.handleDouble(stockInfo[46]);
        dividendYield = stockHelper.handleDouble(stockInfo[48]);
        exDividendPayDate = stockHelper.handleDate(stockInfo[49]);
        symbol = stockInfo[50].replaceAll("\"", "").toUpperCase();
        
        return new Stock(symbol, price, volume, pe, eps, week52low,
                week52high, daylow, dayhigh, movingavg50day, marketcap,
                name, currency, shortRatio, previousClose, open, exchange,
                ask, bid, bookValue, change, askSize, bidSize, avgVolume, dividendYield,
                lastTrade, espEstCurYear, espEstNextYear, espEstNextQtr, floatShares,
                changeYearLow, percentChangeYearLow, lastTradeSize, changeYearHigh,
                percentChangeYearHigh, lastTradePrice, movingAvg200day, movingAvg200change,
                movingAvg200percent, movingAvg50change, movingAvg50percent, changePercent, ps, pb,
                dividendPayDate, peg, espPriceEstimateCurentYear, espPriceEstimateNextYear, dividendPerShare, exDividendPayDate);
    }
}

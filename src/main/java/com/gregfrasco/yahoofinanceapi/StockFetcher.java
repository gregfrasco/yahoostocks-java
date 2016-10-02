package com.gregfrasco.yahoofinanceapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
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
        String sym = symbol.toUpperCase();
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
        Date lastTradeTime;
        double dividendPerShare;
        Date exDividendPayDate;
        try {

            // Retrieve CSV File
            URL yahoo = new URL("http://finance.yahoo.com/d/quotes.csv?s=" + symbol + "&f=l1vrejkghm3j1nc4s7poxabb4c1a5b6a2dd1e7e8e9f6j5j6k3k4k5l1m4m5m6m7m8p2p5p6r1r5r6r7t1yq");
            URLConnection connection = yahoo.openConnection();
            InputStreamReader is = new InputStreamReader(connection.getInputStream());
            BufferedReader br = new BufferedReader(is);

            // Parse CSV Into Array
            String line = br.readLine();
            //Only split on commas that aren't in quotes
            String[] stockInfo = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            // Handle Our Data
            StockHelper sh = new StockHelper();

            price = sh.handleDouble(stockInfo[0]);
            volume = sh.handleInt(stockInfo[1]);
            pe = sh.handleDouble(stockInfo[2]);
            eps = sh.handleDouble(stockInfo[3]);
            week52low = sh.handleDouble(stockInfo[4]);
            week52high = sh.handleDouble(stockInfo[5]);
            daylow = sh.handleDouble(stockInfo[6]);
            dayhigh = sh.handleDouble(stockInfo[7]);
            movingavg50day = sh.handleDouble(stockInfo[8]);
            marketcap = stockInfo[9].replace("\"", "");
            name = stockInfo[10].replace("\"", "");
            currency = stockInfo[11].replace("\"", "");
            shortRatio = sh.handleDouble(stockInfo[12]);
            previousClose = sh.handleDouble(stockInfo[13]);
            open = sh.handleDouble(stockInfo[14]);
            exchange = stockInfo[15].replace("\"", "");
            ask = sh.handleDouble(stockInfo[16]);
            bid = sh.handleDouble(stockInfo[17]);
            bookValue = sh.handleDouble(stockInfo[18]);
            change = sh.handleDouble(stockInfo[19]);
            askSize = sh.handleDouble(stockInfo[20]);
            bidSize = sh.handleDouble(stockInfo[21]);
            avgVolume = sh.handleDouble(stockInfo[22]);
            dividendPerShare = sh.handleDouble(stockInfo[23]);
            lastTrade = sh.handleDate(stockInfo[24]);
            espEstCurYear = sh.handleDouble(stockInfo[25]);
            espEstNextYear = sh.handleDouble(stockInfo[26]);
            espEstNextQtr = sh.handleDouble(stockInfo[27]);
            floatShares = sh.handleDouble(stockInfo[28]);
            changeYearLow = sh.handleDouble(stockInfo[29]);
            percentChangeYearLow = sh.handlePercent(stockInfo[30]);
            lastTradeSize = sh.handleInt(stockInfo[31]);
            changeYearHigh = sh.handleDouble(stockInfo[32]);
            percentChangeYearHigh = sh.handlePercent(stockInfo[33]);
            lastTradePrice = sh.handleDouble(stockInfo[34]);
            movingAvg200day = sh.handleDouble(stockInfo[35]);
            movingAvg200change = sh.handleDouble(stockInfo[36]);
            movingAvg200percent = sh.handlePercent(stockInfo[37]);
            movingAvg50change = sh.handleDouble(stockInfo[38]);
            movingAvg50percent = sh.handlePercent(stockInfo[39]);
            changePercent = sh.handlePercent(stockInfo[40]);
            ps = sh.handleDouble(stockInfo[41]);
            pb = sh.handleDouble(stockInfo[42]);
            dividendPayDate = sh.handleDate(stockInfo[43]);
            peg = sh.handleDouble(stockInfo[44]);
            espPriceEstimateCurentYear = sh.handleDouble(stockInfo[45]);
            espPriceEstimateNextYear = sh.handleDouble(stockInfo[46]);
            lastTradeTime = sh.handleTime(stockInfo[47]);
            dividendYield = sh.handleDouble(stockInfo[48]);
            exDividendPayDate = sh.handleDate(stockInfo[49]);
            
        } catch (IOException e) {
            Logger log = Logger.getLogger(StockFetcher.class.getName());
            log.log(Level.SEVERE, e.toString(), e);
            return null;
        }

        return new Stock(sym, price, volume, pe, eps, week52low,
                week52high, daylow, dayhigh, movingavg50day, marketcap,
                name, currency, shortRatio, previousClose, open, exchange,
                ask, bid, bookValue, change, askSize, bidSize, avgVolume, dividendYield,
                lastTrade,espEstCurYear,espEstNextYear,espEstNextQtr,floatShares, 
                changeYearLow, percentChangeYearLow, lastTradeSize, changeYearHigh,
                percentChangeYearHigh,lastTradePrice,movingAvg200day,movingAvg200change,
                movingAvg200percent,movingAvg50change,movingAvg50percent,changePercent,ps,pb,
                dividendPayDate, peg, espPriceEstimateCurentYear,espPriceEstimateNextYear,
                lastTradeTime,dividendPerShare,exDividendPayDate);

    }
}

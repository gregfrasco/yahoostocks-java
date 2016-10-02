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
        String percentChangeYearLow;
        int lastTradeSize;
        double changeYearHigh;
        String percentChangeYearHigh;
        double lastTradePrice;
        double movingAvg200day;
        double movingAvg50change;
        double movingAvg200change;
        String movingAvg50percent;
        String movingAvg200percent;
        String changePercent;
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
            String[] stockinfo = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            // Handle Our Data
            StockHelper sh = new StockHelper();

            price = sh.handleDouble(stockinfo[0]);
            volume = sh.handleInt(stockinfo[1]);
            pe = sh.handleDouble(stockinfo[2]);
            eps = sh.handleDouble(stockinfo[3]);
            week52low = sh.handleDouble(stockinfo[4]);
            week52high = sh.handleDouble(stockinfo[5]);
            daylow = sh.handleDouble(stockinfo[6]);
            dayhigh = sh.handleDouble(stockinfo[7]);
            movingavg50day = sh.handleDouble(stockinfo[8]);
            marketcap = stockinfo[9].replace("\"", "");
            name = stockinfo[10].replace("\"", "");
            currency = stockinfo[11].replace("\"", "");
            shortRatio = sh.handleDouble(stockinfo[12]);
            previousClose = sh.handleDouble(stockinfo[13]);
            open = sh.handleDouble(stockinfo[14]);
            exchange = stockinfo[15].replace("\"", "");
            ask = sh.handleDouble(stockinfo[16]);
            bid = sh.handleDouble(stockinfo[17]);
            bookValue = sh.handleDouble(stockinfo[18]);
            change = sh.handleDouble(stockinfo[19]);
            askSize = sh.handleDouble(stockinfo[20]);
            bidSize = sh.handleDouble(stockinfo[21]);
            avgVolume = sh.handleDouble(stockinfo[22]);
            dividendPerShare = sh.handleDouble(stockinfo[23]);
            lastTrade = sh.handleDate(stockinfo[24].replace("\"", ""));
            espEstCurYear = sh.handleDouble(stockinfo[25]);
            espEstNextYear = sh.handleDouble(stockinfo[26]);
            espEstNextQtr = sh.handleDouble(stockinfo[27]);
            floatShares = sh.handleDouble(stockinfo[28]);
            changeYearLow = sh.handleDouble(stockinfo[29]);
            percentChangeYearLow = stockinfo[30].replace("\"", "");
            lastTradeSize = sh.handleInt(stockinfo[31]);
            changeYearHigh = sh.handleDouble(stockinfo[32]);
            percentChangeYearHigh = stockinfo[33].replace("\"", "");
            lastTradePrice = sh.handleDouble(stockinfo[34]);
            movingAvg200day = sh.handleDouble(stockinfo[35]);
            movingAvg200change = sh.handleDouble(stockinfo[36]);
            movingAvg200percent = stockinfo[37].replace("\"", "");
            movingAvg50change = sh.handleDouble(stockinfo[38]);
            movingAvg50percent = stockinfo[39].replace("\"", "");
            changePercent = stockinfo[40].replace("\"", "");
            ps = sh.handleDouble(stockinfo[41]);
            pb = sh.handleDouble(stockinfo[42]);
            dividendPayDate = sh.handleDate(stockinfo[43].replace("\"", ""));
            peg = sh.handleDouble(stockinfo[44]);
            espPriceEstimateCurentYear = sh.handleDouble(stockinfo[45]);
            espPriceEstimateNextYear = sh.handleDouble(stockinfo[46]);
            lastTradeTime = sh.handleTime(stockinfo[47].replace("\"", ""));
            dividendYield = sh.handleDouble(stockinfo[48].replace("\"", ""));
            exDividendPayDate = sh.handleDate(stockinfo[49].replace("\"", ""));
            
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

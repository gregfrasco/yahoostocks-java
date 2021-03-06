package com.gregfrasco.yahoofinanceapi;

import java.util.Date;

public class Stock {

    //Stock Infotmation
    private final String symbol;
    private final String name;
    private final String currency;
    private final String exchange;
    
    //Pricing
    private double price;
    private double priceChange;
    private double priceChangePercent;
    private double open;
    private double previousClose;
    private double ask;
    private double bid;
    private double daylow;
    private double dayhigh;
    private double yearLow;
    private double yearHigh;
    
    private double yearLowChange;
    private double yearHighChange;
    private double yearLowChangePercent;
    private double yearHighChangePercent;
    
    private double lastTradePrice;
    private Date lastTradeDate;
    
    //Dividends
    private double dividendYield;
    private double dividendPerShare;
    private Date dividendPayDate;
    private Date exDividendPayDate;
    
    //Averages
    //getOneYearTargetPrice();
    private double movingav50day;
    private double movingAvg50change;
    private double movingAvg50percent;
    private double movingAvg200day;
    private double movingAvg200change;
    private double movingAvg200percent;
    
    //Volume
    private double volume;
    private double askSize;
    private double bidSize;
    private int lastTradeSize;
    private double avgDayVolume;
    private double marketcap;
    private double floatShares;
    
    //Ratios
    private double pe;
    private double eps;
    private double espEstCurrentYear;
    private double espEstNextYear;
    private double espEstNextQuarter;
    private double bookValue;
    private double ps;
    private double pb;
    private double peg;
    private double pegEstCurrentYear;
    private double pegEstNextYear;
    private double shortRatio;

    public Stock(String symbol, double price, double volume, double pe, double eps, double week52low,
            double week52high, double daylow, double dayhigh, double movingav50day, double marketcap,
            String name, String currency, double shortRatio, double previousClose, double open, String exchange,
            double ask, double bid,double bookValue,double change, double askSize, double bidSize, double avgVolume,
            double dividendYield, Date lastTrade, double espEstCurYear, double espEstNextYear, double espEstNextQtr,
            double floatShares, double changeYearLow, double percentChangeYearLow,int lastTradeSize,double changeYearHigh,
            double percentChangeYearHigh,double lastTradePrice, double movingAvg200day, double movingAvg200change,
            double movingAvg200percent, double movingAvg50change, double movingAvg50percent,double changePercent, double ps,
            double pb, Date dividendPayDate, double peg, double espPriceEstimateCurentYear,double espPriceEstimateNextYear,
            double dividendPerShare,Date exDividendPayDate) {
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.pe = pe;
        this.eps = eps;
        this.yearLow = week52low;
        this.yearHigh = week52high;
        this.daylow = daylow;
        this.dayhigh = dayhigh;
        this.movingav50day = movingav50day;
        this.marketcap = marketcap;
        this.name = name;
        this.currency = currency;
        this.shortRatio = shortRatio;
        this.previousClose = previousClose;
        this.open = open;
        this.exchange = exchange;
        this.ask = ask;
        this.bid = bid;
        this.bookValue = bookValue;
        this.priceChange = change;
        this.askSize = askSize;
        this.bidSize = bidSize;
        this.avgDayVolume = avgVolume;
        this.dividendYield = dividendYield;
        this.lastTradeDate = lastTrade;
        this.espEstCurrentYear = espEstCurYear;
        this.espEstNextYear = espEstNextYear;
        this.espEstNextQuarter = espEstNextQtr;
        this.floatShares = floatShares;
        this.yearLowChange = changeYearLow;
        this.yearLowChangePercent = percentChangeYearLow;
        this.lastTradeSize = lastTradeSize;
        this.yearHighChange = changeYearHigh;
        this.yearHighChangePercent = percentChangeYearHigh;
        this.lastTradePrice = lastTradePrice;
        this.movingAvg200change = movingAvg200change;
        this.movingAvg200day = movingAvg200day;
        this.movingAvg200percent = movingAvg200percent;
        this.movingAvg50change = movingAvg50change;
        this.movingAvg50percent = movingAvg50percent;
        this.priceChangePercent = changePercent;
        this.ps = ps;
        this.pb = pb;
        this.dividendPayDate = dividendPayDate;
        this.peg = peg;
        this.pegEstCurrentYear = espPriceEstimateCurentYear;
        this.pegEstNextYear = espPriceEstimateNextYear;
        this.dividendPerShare = dividendPerShare;
        this.exDividendPayDate = exDividendPayDate;
    }

    public String getExchange() {
        return this.exchange;
    }

    public double getPreviousClose() {
        return this.previousClose;
    }

    public double getOpen() {
        return this.open;
    }

    public double getShortRatio() {
        return this.shortRatio;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public double getPrice() {
        return this.price;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getPE() {
        return this.pe;
    }

    public double getEPS() {
        return this.eps;
    }

    public double getYearLow() {
        return this.yearLow;
    }

    public double getYearHigh() {
        return this.yearHigh;
    }

    public double getDaylow() {
        return this.daylow;
    }

    public double getDayhigh() {
        return this.dayhigh;
    }

    public double get50DayMovingAvg() {
        return this.movingav50day;
    }

    public double getMarketCap() {
        return this.marketcap;
    }

    public String getName() {
        return this.name;
    }

    public double getAsk() {
        return ask;
    }

    public double getBid() {
        return bid;
    }

    public double getBookValue() {
        return bookValue;
    }

    public double getPriceChange() {
        return priceChange;
    }

    public double getAskSize() {
        return askSize;
    }

    public double getBidSize() {
        return bidSize;
    }

    public double getAvgDayVolume() {
        return avgDayVolume;
    }

    public double getDividendYield() {
        return dividendYield;
    }

    public Date getLastTradeDate() {
        return lastTradeDate;
    }

    public double getESPestCurrentYear() {
        return espEstCurrentYear;
    }

    public double getESPestNextYear() {
        return espEstNextYear;
    }

    public double getESPestNextQuarter() {
        return espEstNextQuarter;
    }

    public double getFloatShares() {
        return floatShares;
    }

    public double getYearLowChange() {
        return yearLowChange;
    }

    public double getYearLowChangePercent() {
        return yearLowChangePercent;
    }

    public int getLastTradeSize() {
        return lastTradeSize;
    }

    public double getChangeYearHigh() {
        return yearHighChange;
    }

    public double getYearHighChangePercent() {
        return yearHighChangePercent;
    }

    public double getLastTradePrice() {
        return lastTradePrice;
    }

    public double get200DayMovingAvg() {
        return movingAvg200day;
    }

    public double get200DayMovingAvgChange() {
        return movingAvg200change;
    }

    public double get200DayMovingAvgPercent() {
        return movingAvg200percent;
    }

    public double get50DayMovingAvgChange() {
        return movingAvg50change;
    }

    public double get50DayMovingAvgPercent() {
        return movingAvg50percent;
    }

    public double getPriceChangePercent() {
        return priceChangePercent;
    }

    public double getPSR() {
        return ps;
    }

    public double getPBR() {
        return pb;
    }

    public Date getDividendPayDate() {
        return dividendPayDate;
    }

    public double getPEG() {
        return peg;
    }

    public double getPEGestCurentYear() {
        return pegEstCurrentYear;
    }

    public double getPEGestNextYear() {
        return pegEstNextYear;
    }

    public double getDividendPerShare() {
        return dividendPerShare;
    }

    public Date getExDividendPayDate() {
        return exDividendPayDate;
    }
    
}

package com.gregfrasco.yahoofinanceapi;

import java.util.Date;

public class Stock {

    private String symbol;
    private double price;
    private int volume;
    private double pe;
    private double eps;
    private double week52low;
    private double week52high;
    private double daylow;
    private double dayhigh;
    private double movingav50day;
    private String marketcap;
    private String name;
    private String currency;
    private double shortRatio;
    private double previousClose;
    private double open;
    private String exchange;
    private double ask;
    private double bid;
    private double bookValue;
    private double change;
    private double askSize;
    private double bidSize;
    private double avgVolume;
    private double dividendYield;
    private Date lastTrade;
    private double espEstCurYear;
    private double espEstNextYear;
    private double espEstNextQtr;
    private double floatShares;
    private double changeYearLow; 
    private String percentChangeYearLow;
    private int lastTradeSize;
    private double changeYearHigh; 
    private String percentChangeYearHigh;
    private double lastTradePrice;
    private double movingAvg200day;
    private double movingAvg200change;
    private String movingAvg200percent;
    private double movingAvg50change;
    private String movingAvg50percent;
    private String changePercent;
    private double ps;
    private double pb;
    private Date dividendPayDate;

    public Stock(String symbol, double price, int volume, double pe, double eps, double week52low,
            double week52high, double daylow, double dayhigh, double movingav50day, String marketcap,
            String name, String currency, double shortRatio, double previousClose, double open, String exchange,
            double ask, double bid,double bookValue,double change, double askSize, double bidSize, double avgVolume,
            double dividendYield, Date lastTrade, double espEstCurYear, double espEstNextYear, double espEstNextQtr,
            double floatShares, double changeYearLow, String percentChangeYearLow,int lastTradeSize,double changeYearHigh,
            String percentChangeYearHigh,double lastTradePrice, double movingAvg200day, double movingAvg200change,
            String movingAvg200percent, double movingAvg50change, String movingAvg50percent,String changePercent, double ps,
            double pb, Date dividendPayDate) {
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.pe = pe;
        this.eps = eps;
        this.week52low = week52low;
        this.week52high = week52high;
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
        this.change = change;
        this.askSize = askSize;
        this.bidSize = bidSize;
        this.avgVolume = avgVolume;
        this.dividendYield = dividendYield;
        this.lastTrade = lastTrade;
        this.espEstCurYear = espEstCurYear;
        this.espEstNextYear = espEstNextYear;
        this.espEstNextQtr = espEstNextQtr;
        this.floatShares = floatShares;
        this.changeYearLow = changeYearLow;
        this.percentChangeYearLow = percentChangeYearLow;
        this.lastTradeSize = lastTradeSize;
        this.changeYearHigh = changeYearHigh;
        this.percentChangeYearHigh = percentChangeYearHigh;
        this.lastTradePrice = lastTradePrice;
        this.movingAvg200change = movingAvg200change;
        this.movingAvg200day = movingAvg200day;
        this.movingAvg200percent = movingAvg200percent;
        this.movingAvg50change = movingAvg50change;
        this.movingAvg50percent = movingAvg50percent;
        this.changePercent = changePercent;
        this.ps = ps;
        this.pb = pb;
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

    public int getVolume() {
        return this.volume;
    }

    public double getPe() {
        return this.pe;
    }

    public double getEps() {
        return this.eps;
    }

    public double getWeek52low() {
        return this.week52low;
    }

    public double getWeek52high() {
        return this.week52high;
    }

    public double getDaylow() {
        return this.daylow;
    }

    public double getDayhigh() {
        return this.dayhigh;
    }

    public double getMovingav50day() {
        return this.movingav50day;
    }

    public String getMarketcap() {
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

    public double getChange() {
        return change;
    }

    public double getAskSize() {
        return askSize;
    }

    public double getBidSize() {
        return bidSize;
    }

    public double getAvgVolume() {
        return avgVolume;
    }

    public double getDividendYield() {
        return dividendYield;
    }

    public Date getLastTrade() {
        return lastTrade;
    }

    public double getEspEstCurYear() {
        return espEstCurYear;
    }

    public double getEspEstNextYear() {
        return espEstNextYear;
    }

    public double getEspEstNextQtr() {
        return espEstNextQtr;
    }

    public double getFloatShares() {
        return floatShares;
    }

    public double getChangeYearLow() {
        return changeYearLow;
    }

    public String getPercentChangeYearLow() {
        return percentChangeYearLow;
    }

    public int getLastTradeSize() {
        return lastTradeSize;
    }

    public double getChangeYearHigh() {
        return changeYearHigh;
    }

    public void setChangeYearHigh(double changeYearHigh) {
        this.changeYearHigh = changeYearHigh;
    }

    public String getPercentChangeYearHigh() {
        return percentChangeYearHigh;
    }

    public void setPercentChangeYearHigh(String percentChangeYearHigh) {
        this.percentChangeYearHigh = percentChangeYearHigh;
    }

    public double getLastTradePrice() {
        return lastTradePrice;
    }

    public double getMovingAvg200day() {
        return movingAvg200day;
    }

    public double getMovingAvg200change() {
        return movingAvg200change;
    }

    public String getMovingAvg200percent() {
        return movingAvg200percent;
    }

    public double getMovingAvg50change() {
        return movingAvg50change;
    }

    public String getMovingAvg50percent() {
        return movingAvg50percent;
    }

    public String getChangePercent() {
        return changePercent;
    }

    public double getPs() {
        return ps;
    }

    public double getPb() {
        return pb;
    }

    public Date getDividendPayDate() {
        return dividendPayDate;
    }
    
}

package com.gregfrasco.yahoofinanceapi;

import org.junit.Test;

public class StockTest {

    @Test
    public void testStock() {

        Stock stock = StockFetcher.getStock("FB");
        System.out.println("Price: " + stock.getPrice());
        System.out.println("Volume: " + stock.getVolume());
        System.out.println("P/E: " + stock.getPe());
        System.out.println("EPS: " + stock.getEps());
        System.out.println("Year Low: " + stock.getWeek52low());
        System.out.println("Year High: " + stock.getWeek52high());
        System.out.println("Day Low: " + stock.getDaylow());
        System.out.println("Day High: " + stock.getDayhigh());
        System.out.println("50 Day Moving Av: " + stock.getMovingav50day());
        System.out.println("Market Cap: " + stock.getMarketcap());
        System.out.println("The full name is: " + stock.getName());
        System.out.println("The currency is: " + stock.getCurrency());
        System.out.println("The short ratio is: " + stock.getShortRatio());
        System.out.println("The previous close was: " + stock.getPreviousClose());
        System.out.println("The open for today was: " + stock.getOpen());
        System.out.println("The exchange is " + stock.getExchange());
        System.out.println("Ask " + stock.getAsk());
        System.out.println("Bid " + stock.getBid());
        System.out.println("Book Value " + stock.getBookValue());
        System.out.println("Change " + stock.getChange());
        System.out.println("Ask Size " + stock.getAskSize());
        System.out.println("Bid Size " + stock.getBidSize());
        System.out.println("Average Volume " + stock.getAvgVolume());
        System.out.println("Dividend Yield " + stock.getDividendYield());
        System.out.println("Last Trade " + stock.getLastTrade());
        System.out.println("ESP estimate cur year " + stock.getEspEstCurYear());
        System.out.println("ESP estimate next year " + stock.getEspEstNextYear());
        System.out.println("ESP estimate next qtr " + stock.getEspEstNextQtr());
        System.out.println("Float Shares " + stock.getFloatShares());
        System.out.println("Year Low Change " + stock.getChangeYearLow());
        System.out.println("Year Low Change % " + stock.getPercentChangeYearLow());
        System.out.println("Last Trade Size " + stock.getLastTradeSize());
        System.out.println("Year High Change " + stock.getChangeYearHigh());
        System.out.println("Year High Change % " + stock.getPercentChangeYearHigh());
        System.out.println("Last Trade Price " + stock.getLastTradePrice());
        System.out.println("50 day moving change " + stock.getMovingAvg50change());
        System.out.println("50 day moving percent " + stock.getMovingAvg50percent());
        System.out.println("200 day moving average " + stock.getMovingAvg200day());
        System.out.println("200 day moving change " + stock.getMovingAvg200change());
        System.out.println("200 day moving percent " + stock.getMovingAvg200percent());
        System.out.println("Change in Percent " + stock.getChangePercent());
        System.out.println("P/S " + stock.getPs());
        System.out.println("P/B " + stock.getPb());
        System.out.println("Dividend Pay Date " + stock.getDividendPayDate());
    }
}

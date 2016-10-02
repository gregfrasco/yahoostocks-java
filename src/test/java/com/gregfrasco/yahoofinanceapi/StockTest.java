package com.gregfrasco.yahoofinanceapi;

import org.junit.Test;

public class StockTest {

    @Test
    public void testStock() {

        Stock stock = StockFetcher.getStock("GE");
        System.out.println("Price: " + stock.getPrice());
        System.out.println("Volume: " + stock.getVolume());
        System.out.println("P/E: " + stock.getPE());
        System.out.println("EPS: " + stock.getEPS());
        System.out.println("Year Low: " + stock.getYearLow());
        System.out.println("Year High: " + stock.getYearHigh());
        System.out.println("Day Low: " + stock.getDaylow());
        System.out.println("Day High: " + stock.getDayhigh());
        System.out.println("50 Day Moving Av: " + stock.get50DayMovingAvg());
        System.out.println("Market Cap: " + stock.getMarketCap());
        System.out.println("The full name is: " + stock.getName());
        System.out.println("The currency is: " + stock.getCurrency());
        System.out.println("The short ratio is: " + stock.getShortRatio());
        System.out.println("The previous close was: " + stock.getPreviousClose());
        System.out.println("The open for today was: " + stock.getOpen());
        System.out.println("The exchange is " + stock.getExchange());
        System.out.println("Ask " + stock.getAsk());
        System.out.println("Bid " + stock.getBid());
        System.out.println("Book Value " + stock.getBookValue());
        System.out.println("Change " + stock.getPriceChange());
        System.out.println("Ask Size " + stock.getAskSize());
        System.out.println("Bid Size " + stock.getBidSize());
        System.out.println("Average Volume " + stock.getAvgDayVolume());
        System.out.println("Dividend Yield " + stock.getDividendYield());
        System.out.println("Last Trade " + stock.getLastTradeDate());
        System.out.println("ESP estimate cur year " + stock.getESPestCurrentYear());
        System.out.println("ESP estimate next year " + stock.getESPestNextYear());
        System.out.println("ESP estimate next qtr " + stock.getESPestNextQuarter());
        System.out.println("Float Shares " + stock.getFloatShares());
        System.out.println("Year Low Change " + stock.getYearLowChange());
        System.out.println("Year Low Change % " + stock.getYearLowChangePercent());
        System.out.println("Last Trade Size " + stock.getLastTradeSize());
        System.out.println("Year High Change " + stock.getChangeYearHigh());
        System.out.println("Year High Change % " + stock.getYearHighChangePercent());
        System.out.println("Last Trade Price " + stock.getLastTradePrice());
        System.out.println("50 day moving change " + stock.get50DayMovingAvgChange());
        System.out.println("50 day moving percent " + stock.get50DayMovingAvgPercent());
        System.out.println("200 day moving average " + stock.get200DayMovingAvg());
        System.out.println("200 day moving change " + stock.get200DayMovingAvgChange());
        System.out.println("200 day moving percent " + stock.get200DayMovingAvgPercent());
        System.out.println("Change in Percent " + stock.getPriceChangePercent());
        System.out.println("P/S " + stock.getPSR());
        System.out.println("P/B " + stock.getPBR());
        System.out.println("Dividend Pay Date " + stock.getDividendPayDate());
        System.out.println("PEG " + stock.getPEG());
        System.out.println("Price/EPS Estimate Current Year " + stock.getPEGestCurentYear());
        System.out.println("Price/EPS Estimate Next Year " + stock.getPEGestNextYear());
        System.out.println("Last Trade Time " + stock.getLastTradeTime());
        System.out.println("Dividend Per Share " + stock.getDividendPerShare());
        System.out.println("Ex Dividend Pay Date " + stock.getExDividendPayDate());
    }
}

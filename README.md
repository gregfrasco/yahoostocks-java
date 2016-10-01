Java Stocks
============

A super simple library to help you retrieve stock data using the Yahoo Finance hidden API.

[![Build Status](https://travis-ci.org/gregfrasco/Yahoo-Finance-API.svg?branch=master)](https://travis-ci.org/gregfrasco/Yahoo-Finance-API)

## How it works

Yahoo Finance allows stock data to be downloaded in CSV format. All we have to do is take that CSV file and parse it to get our data. Easy.

## Usage

```java
Stock facebook = StockFetcher.getStock("FB");
```

## Methods

The library currently supports the following methods:

### Stock Information
```java
getSymbol();
getName();
getCurrency();
getExchange();
```

### Pricing
```java
getPrice();
getPriceChange();
getPriceChangePercent();
getOpen();
getPreviousClose();
getBid();
getAsk();
getDaylow();
getDayhigh();
getYearlow();
getYearhigh();

getYearLowChange();
getYearLowPercent();
getYearHighChange();
getYearHighPercent();

getLastTradePrice();
getLastTradeDate();
```

### Dividends
```java
getDividendYield();
getDividendPerShare();
getDividendPayDate();
getExDividendPayDate();
```

### Averages
```
getOneYearTargetPrice();
get50DayMovingAvg();
get50DayMovingAvgChange();
get50DayMovingAbgPercent();
get200DayMovingAvg();
get200DayMovingAvgChange();
get200DayMovingAbgPercent();
```

### Volume
```java
getVolume();
getAskSize();
getBidSize();
getLastTradeSize();
getAvgDayVolume();
```

### Ratios
```java
getPE();
getESP();
getESPestCurentYear();
getESPestNextYear();
getESPestNextQuarter();
getBookValue();
getPSR(); //(P/S Ratio)
getPBR(); //(P/B Ratio)
getPEG();
getPEGestCurrentYear();
getPEGestNextYear();
getShortRatio();
```

## Testing

To test the library, run StockTest.java as a jUnit Test.

## Coming Soon

* Retrieve Multiple Stocks at Once
* More Methods

## Compatibility

* Open jdk 7
* Oracle jdk 7
* Oracle jdk 8

## Contributors

Special Thanks To:

* [erbycfischer](https://github.com/erbycfischer)
* [gregfrasco](https://github.com/gregfrasco)

## License

* No Warranty Expressed or Implied. Sofware is as is.
* [MIT License](http://opensource.org/licenses/mit-license.php)

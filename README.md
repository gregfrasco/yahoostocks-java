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
getAsk();
getBid();
getDaylow();
getDayhigh();
getYearlow();
getYearhigh();

getYearLowChange();
getYearLowChangePercent();
getYearHighPercent();
getYearHighChangePercent();

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
get50DayMovingAvgPercent();
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

### [The MIT License (MIT)](http://opensource.org/licenses/mit-license.php)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

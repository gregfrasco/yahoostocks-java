/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gregfrasco.yahoofinanceapi;

import org.junit.Test;

/**
 *
 * @author frascog
 */
public class MultiStockTest {
    
    @Test
    public void MultiStockTest() {
        Stock[] stocks = StockFetcher.getStocks("GE","FB");
        for(Stock stock : stocks){
            System.out.println(stock.getSymbol() + " " + stock.getPrice());
        }
    }
    
}

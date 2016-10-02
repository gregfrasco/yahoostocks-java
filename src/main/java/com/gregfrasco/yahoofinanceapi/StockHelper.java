package com.gregfrasco.yahoofinanceapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class StockHelper {

    public StockHelper() {

    }

    public double handleDouble(String x) {
        x = x.replaceAll("\"", "");
        Double y;
        if (Pattern.matches("N/A", x)) {
            y = 0.00;
        } else {
            y = Double.parseDouble(x);
        }
        return y;
    }

    public int handleInt(String x) {
        x = x.replaceAll("\"", "");
        int y;
        if (Pattern.matches("N/A", x)) {
            y = 0;
        } else {
            y = Integer.parseInt(x);
        }
        return y;
    }
    
    public Date handleDate(String x) {
        x = x.replaceAll("\"", "");
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        try {
            return format.parse(x);
        } catch (ParseException ex) {
            return null;
        }
    }
    
    public Date handleTime(String x) {
        x = x.replaceAll("\"", "");
        SimpleDateFormat format = new SimpleDateFormat("HH:mma");
        try {
            return format.parse(x);
        } catch (ParseException ex) {
            return null;
        }
    }
    
    public double handlePercent(String x){
        x = x.replaceAll("\"", "").replaceAll("%", "");
        try{
            return Double.parseDouble(x) / 100;
        } catch(Exception ex){
            return 0;
        }
    }

}

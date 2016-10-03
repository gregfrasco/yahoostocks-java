package com.gregfrasco.yahoofinanceapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class StockHelper {

    public double handleDouble(String stringDouble) {
        stringDouble = stringDouble.replaceAll("\"", "");
        Double y;
        if (Pattern.matches("N/A", stringDouble)) {
            y = 0.00;
        } else {
            y = Double.parseDouble(stringDouble);
        }
        return y;
    }

    public int handleInt(String stringInt) {
        stringInt = stringInt.replaceAll("\"", "");
        int y;
        if (Pattern.matches("N/A", stringInt)) {
            y = 0;
        } else {
            y = Integer.parseInt(stringInt);
        }
        return y;
    }
    
    public Date handleDate(String stringDate) {
        stringDate = stringDate.replaceAll("\"", "");
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        try {
            return format.parse(stringDate);
        } catch (ParseException ex) {
            return null;
        }
    }
    
    public Date handleTime(String stringTime) {
        stringTime = stringTime.replaceAll("\"", "");
        SimpleDateFormat format = new SimpleDateFormat("HH:mma");
        try {
            return format.parse(stringTime);
        } catch (ParseException ex) {
            return null;
        }
    }
    
    public double handlePercent(String stringPercent){
        stringPercent = stringPercent.replaceAll("\"", "").replaceAll("%", "");
        try{
            return Double.parseDouble(stringPercent) / 100;
        } catch(Exception ex){
            return 0;
        }
    }
    
    public Date handleDateTime(String stringDateTime){
        stringDateTime = stringDateTime.replaceAll("\"", "");
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mma");
        try {
            return format.parse(stringDateTime);
        } catch (ParseException ex) {
            return null;
        }
    }

}

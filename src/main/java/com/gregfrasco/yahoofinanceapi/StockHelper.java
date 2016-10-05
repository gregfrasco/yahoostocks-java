package com.gregfrasco.yahoofinanceapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StockHelper {

    public double handleDouble(String stringDouble) {
        try{
            return Double.parseDouble(stringDouble.replaceAll("\"", ""));
        } catch(Exception ex){
            return 0;
        }
    }

    public int handleInt(String stringInt) {
        try{
            return Integer.parseInt(stringInt.replaceAll("\"", ""));
        } catch(Exception ex){
            return 0;
        }
    }

    public Date handleDate(String stringDate) {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        try {
            return format.parse(stringDate.replaceAll("\"", ""));
        } catch (ParseException ex) {
            return null;
        }
    }

    public Date handleTime(String stringTime) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mma");
        try {
            return format.parse(stringTime.replaceAll("\"", ""));
        } catch (ParseException ex) {
            return null;
        }
    }

    public double handlePercent(String stringPercent) {
        String parseNumber = stringPercent.replaceAll("\"", "").replaceAll("%", "");
        try {
            return Double.parseDouble(parseNumber);
        } catch (Exception ex) {
            return 0;
        }
    }

    public Date handleDateTime(String stringDateTime) {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mma");
        try {
            return format.parse(stringDateTime.replaceAll("\"", ""));
        } catch (ParseException ex) {
            return null;
        }
    }

    public double formatNumber(String number) {
        Pattern patternofBillion = Pattern.compile("B$");
        Matcher matchBillion = patternofBillion.matcher(number.replaceAll("\"", ""));
        Pattern patternofMillion = Pattern.compile("M$");
        Matcher matchMillion = patternofMillion.matcher(number.replaceAll("\"", ""));
        if (matchBillion.find()) {
            return Double.parseDouble(number.replaceAll("\"", "").substring(0, number.length() - 1)) * 1E9;
        } else if (matchMillion.find()) {
            return Double.parseDouble(number.replaceAll("\"", "").substring(0, number.length() - 1)) * 1E6;
        } else {
            return Double.parseDouble(number.replaceAll("\"", ""));
        }
    }
}
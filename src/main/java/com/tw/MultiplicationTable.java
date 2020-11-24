package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        boolean isValid = isValid(startNumber, endNumber);
        String multiplicationTable = "";
        if (isValid) {
            multiplicationTable = generateMultiplicationTable(startNumber, endNumber);
            return multiplicationTable;

        }else {
            multiplicationTable = null;
        }
        return multiplicationTable;
    }

    public String generateMultiplicationTable(int startNumber, int endNumber) {
        String strTable = "";
        for(int i=startNumber; i<= endNumber; i++ ){
            String line = generateMultiplicationLine(startNumber, i);
            if(i == endNumber){
                strTable += line;
            }else{
                strTable += line + "\r\n";
            }
        }

        return strTable;
    }

    String generateMultiplicationLine(int startNumber, int row) {
        String strLine = "";
        for(int i= startNumber; i<= row; i++){
            if(i == row){
                strLine += i + "*" + row + "=" + i*row;
            }else{
                strLine += i + "*" + row + "=" + i*row + "  ";
            }
        }

        return strLine;
    }


    public boolean isValid(int startNumber, int endNumber) {
        boolean isStartNumInRange = isNUmInRange(startNumber);
        boolean isEndNumInRange = isNUmInRange(endNumber);
        boolean isStartSmaller = isEndlarger(startNumber, endNumber);
        if (isStartNumInRange && isEndNumInRange && isStartSmaller){
            return true;
        }else {
            return false;
        }

    }

    public boolean isEndlarger(int startNumber, int endNumber) {
        if(startNumber <= endNumber){
            return true;
        }else {
            return false;
        }
    }

    public boolean isNUmInRange(int num) {
        if(num > 0 && num <= 1000){
            return true;
        }else{
            return  false;
        }
    }
}






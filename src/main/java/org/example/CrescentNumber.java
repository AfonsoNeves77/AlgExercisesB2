package org.example;

public class CrescentNumber {

    public static boolean isValidNumber(int n){
        return n >= 100 && n <=999;
    }

    public static boolean isCrescent(int n){
        if(isValidNumber(n)){
            int c = n/100;
            int d = (n/10)%10;
            int u = n % 10;

            return u > d && d > c;
        }
            return false;
    }

}

package org.example;

public class PriceArticle {

    public static double articlePriceCalc(double productPrice){
        if(productPrice <= 0){
            return -1;
        }
        else {
            if (productPrice > 50){
                if (productPrice > 100){
                    if (productPrice > 200){
                        return productPrice * 0.4;
                    }
                    return productPrice * 0.6;
                }
                return productPrice * 0.7;
            }
            return productPrice * 0.8;
        }
    }



}

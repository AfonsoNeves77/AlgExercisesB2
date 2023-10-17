package org.example;

public class MultipleExercise {

    public static String isMultiple(double x, double y){

            if(x != y){
                if (x % y == 0) {return x + " is multiple of " + y;
                }
                else {
                    if (y % x == 0) {return y + " is multiple of " + x;}
                    else {
                        return x + " is not multiple/divisor of " + y + ". " + y + " is not multiple/divisor of " + x;
                    }
                }
            }
            else {return "Both are multiples";}

    }


}

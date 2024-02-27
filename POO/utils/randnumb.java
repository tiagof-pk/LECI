package utils;

public class randnumb {
    public static double random(double min, double max){
        return Math.round(((Math.random() * ((max - min)) + min))*10)/ 10.0;
    }
}

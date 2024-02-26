package utils;

public class Contacts {
    public static boolean validatePostal(String str){
        return  str.contains("@") && (str.lastIndexOf(".pt") == str.length()-3 || str.lastIndexOf(".com")== str.length()-4);
    }
    public static boolean validateMail(String str){
        return  str.contains("@") && (str.lastIndexOf(".pt") == str.length()-3 || str.lastIndexOf(".com")== str.length()-4);
    }

    public static boolean validateNumbr(int numbr){
        String str = Integer.toString(numbr);
        return (numbr/100000000) == 9 && str.length() == 9;

    }
}

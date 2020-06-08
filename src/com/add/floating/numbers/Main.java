package com.add.floating.numbers;

/*
Adding two floating point numbers passed as string without using bigNumber or int etc.
and return values as string

eg:

"11.23" + "12.33" = "23.56"

 */


public class Main {
    public static void main(String[] args){
        System.out.println(Solution.addStrings("1111.11", "2220"));
    }
}

class Solution {
    //pattern to check if correct value is passed
    static String pat = "[-+]?[0-9]*\\.?[0-9]+";

    //method to add floating point numbers as string
    public static String addStrings(String string1, String string2) {

        //error checking
        if(!string1.matches(pat) || !string2.matches(pat)) return null;

        //removing the trailing zeros
        string1 = removeExtraZeros(string1);
        string2 = removeExtraZeros(string2);

        //managing the floating point numbers and converting them into integer
        int dec1 = getDec(string1), dec2 = getDec(string2), fac = dec1;
        if(dec1>dec2) string2 = addZero(string2, dec1-dec2);
        else if(dec1<dec2){
            fac=dec2;
            string1 = addZero(string1, dec2-dec1);
        }
        string1 = string1.replace(".","");
        string2 = string2.replace(".","");

        //adding the integer numbers
        String returnVal = addIntStrings(string1,string2);

        //in case both numbers were already integers
        if(fac == 0) return returnVal;

        //converting the numbers into floating point again and removing the extra trailing zeros
        int pos = returnVal.length()-fac;
        return removeExtraZeros(returnVal.substring(0, pos) + "." + returnVal.substring(pos));
    }

    //method to add integers as string
    public static String addIntStrings(String str1, String str2) {
        int strlen1 = str1.length(), strlen2 = str2.length(), car = 0, len = Math.max(strlen1, strlen2);
        char[] retChr = new char[len + 1];
        for(int x = 0; x <= len ; x++) {
            int a = x < strlen1 ? (str1.charAt(strlen1 - x - 1) - '0') : 0;
            int b = x < strlen2 ? (str2.charAt(strlen2 - x - 1) - '0') : 0;
            retChr[len - x] = (char)((a + b + car) % 10 + '0');
            car = (a + b + car) / 10;
        }
        return retChr[0] == '0' ? new String(retChr, 1, len) : new String(retChr, 0, len + 1);
    }

    //removing extra trailing zeros from the string
    public static String removeExtraZeros (String str) {
        return str.contains(".") ? str.replaceAll("0*$","").replaceAll("\\.$","") : str;
    }

    //code to get the position of the dot in the floating point number
    public static int getDec(String str){
        return str.contains(".") ? str.length()-str.indexOf('.')-1 : 0;
    }

    //code to add extra zeros in the end of the string
    public static String addZero(String str, int zero){
        while(zero!=0){
            str = str.concat("0");
            zero--;
        } return str;
    }

}
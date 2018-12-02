package com.company;


public class Main {
    //Given an array of 5 integers see if the sum of any 2 in array are 10
    public static void main(String args[]) {
        String inputString = "pale";
        String inputString2 = "bale";
        System.out.println(solution(inputString, inputString2));


    }

    private static String solution(String in1, String in2) {
        int lenDifference = Math.abs(in1.length() - in2.length());
        if(lenDifference >= 2){
            return "FALSE";
        }
        String shortStr = in1.length() > in2.length()? in2:in1;
        String longStr = shortStr.equals(in1)? in2:in1;
        //System.out.println("Short Str :" + shortStr);
        //System.out.println("Long Str :" + longStr);
        int wrongCount = 0;
        int longIndex = 0;
        //i is short index
        for (int i = 0; i <= shortStr.length() - 1; i++) {

            if ((shortStr.charAt(i) != longStr.charAt(longIndex))
                    && (shortStr.length() != longStr.length())) {
                if ((longIndex - i) >= 2) {
                    return "FALSE";
                }
                longIndex++;
            }
            if (shortStr.charAt(i) != longStr.charAt(longIndex)) {
                wrongCount++;
                if (wrongCount >= 2) {
                    return "FALSE";
                }
            }
            longIndex++;
            //System.out.println("Wrong Count:"+wrongCount);
        }
        return "TRUE";
    }
}




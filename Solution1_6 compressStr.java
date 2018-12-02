package com.company;


public class Main {
    public static void main(String args[]) {
        String inputString = "aaabccd";
        String expected = "a3b1c2d1";
        System.out.println(solution(inputString));
        System.out.println("Expected: " + expected);
    }
    //1.6 String compression!
    private static String solution(String in1) {
        StringBuilder sb = new StringBuilder();
        in1 = in1.toLowerCase();
        char lastChar = in1.charAt(0);
        sb.append(in1.charAt(0));
        int streak = 1;
        //Book solution is shorter and they suggest counting compression length before making a new string to
        //save run time. Making a string will be more time, unless there's large amount of consecutive strings
        for (int i = 1; i <= in1.length() - 1; i++) {
            if (lastChar == in1.charAt(i)) {
                streak++;
            } else {
                sb.append(streak);
                streak = 1;
                sb.append(in1.charAt(i));
            }
            if (i == in1.length() - 1) {
                sb.append(streak);
            }
            lastChar = in1.charAt(i);
        }
        return sb.toString().length() < in1.length()? sb.toString(): in1;
    }

}




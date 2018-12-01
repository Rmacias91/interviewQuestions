package com.company;


public class Main {
    //Given an array of 5 integers see if the sum of any 2 in array are 10
    public static void main(String args[]) {
        String inputString = " Mr John Smith        ";
        int len = 14;
        String expected = "%20Mr%20John%20Smith";
        String output = solution(inputString.toCharArray(), len);

        System.out.println(expected);
        System.out.println(output);

        if (expected.equals(output)) {
            System.out.println("GOOD!");
        }

    }

    private static String solution(char[] input, int len) {
        //so work backwards. Why do we need to know # of spaces. so we know where to move the last char maybe?
        int numOfSpaces = 0;
        for (int i = 0; i <= len - 1; i++) {
            if (input[i] == ' ') {
                numOfSpaces++;
            }
        }
        // Move last char num of white spaces *2
        int endPtr = (numOfSpaces * 2) + len -1;
        for(int i = len-1; i >=0; i--){
            if(input[i] == ' '){
                //Do stuff to make it %20 and move three times
                input[endPtr] = '0';
                endPtr--;
                input[endPtr] = '2';
                endPtr--;
                input[endPtr] = '%';
                endPtr --;
            } else {
                //move it to the endPtr
                input[endPtr] = input[i];
                endPtr --;
            }
//            System.out.println(new String(input));
//            System.out.println(endPtr);
//            System.out.println(i);

        }
        //System.out.println(numOfSpaces);
        return new String(input);
    }
}




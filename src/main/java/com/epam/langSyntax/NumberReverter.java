package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int digit, result = 0;
        while(number > 0){
            digit = number % 10;
            number = number / 10;
            result = result*10 + digit;
        }
        System.out.println(result);
    }

}

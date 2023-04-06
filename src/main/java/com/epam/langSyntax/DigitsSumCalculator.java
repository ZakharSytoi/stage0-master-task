package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int digit, result = 0;
        while(number > 0){
            digit = number % 10;
            number = number / 10;
            result = digit;
        }
        System.out.println(result);
    }

}

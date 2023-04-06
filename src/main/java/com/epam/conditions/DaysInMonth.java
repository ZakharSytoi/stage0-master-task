package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 4, 6, 9, 11 -> System.out.println(30);
            case 2 -> {
                if (isLeapYear(year)) System.out.println(29);
                else System.out.println(28);
            }
            default -> System.out.println("invalid date");
        }
    }

    public static boolean isLeapYear (int leapYear) {
        return leapYear > 1582 && leapYear % 4 == 0 && leapYear % 100 != 0 ||
                leapYear > 1582 && leapYear % 4 == 0 && (leapYear % 100 != 0 || leapYear
                        % 400 == 0);
    }
}

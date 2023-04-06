package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if(monthNumber == 12 || monthNumber > 0 && monthNumber <= 2){
            System.out.println("Winter");
        }
        else if(monthNumber > 2 && monthNumber <= 5){
            System.out.println("Spring");
        }
        else if(monthNumber > 5 && monthNumber <= 8){
            System.out.println("Summer");
        }
        else if(monthNumber > 8 && monthNumber <= 11){
            System.out.println("Autumn");
        }
        else System.out.println("Wrong month number");
    }

}

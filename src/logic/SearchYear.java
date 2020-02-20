package logic;

import sun.util.calendar.LocalGregorianCalendar;

import java.util.Date;

public class SearchYear {

    private String animal;
    private String colour;
    private int calcYearAnimal;
    private int calcYearColour;




    public void start() {

        calcYearAnimal = 0;
        calcYearColour = 0;
        animal = null;
        colour = null;

        //Class logic.UIUtils is from another task for easy entering input data
        System.out.println("NOTE! Years B.C. could not be used." );
       int putYear = UIUtils.readNumber("Now, please, enter the year: ");

       //Look for animal - the period is from 0 A.D. The array is not necessary - too much un useful info

            calcYearAnimal = putYear % 12;

                   if (calcYearAnimal == 1924 % 12) {animal = "Rat";
            } else if (calcYearAnimal == 1925 % 12) {animal = "Ox";
            } else if (calcYearAnimal == 1926 % 12) {animal = "Tiger";
            } else if (calcYearAnimal == 1927 % 12) {animal = "Rabbit";
            } else if (calcYearAnimal == 1928 % 12) {animal = "Dragon";
            } else if (calcYearAnimal == 1929 % 12) {animal = "Snake";
            } else if (calcYearAnimal == 1930 % 12) {animal = "Horse";
            } else if (calcYearAnimal == 1931 % 12) {animal = "Goat";
            } else if (calcYearAnimal == 1932 % 12) {animal = "Monkey";
            } else if (calcYearAnimal == 1933 % 12) {animal = "Rooster";
            } else if (calcYearAnimal == 1934 % 12) {animal = "Dog";
            } else if (calcYearAnimal == 1935 % 12) {animal = "Pig";}
    //    } else animal = "there is no animal ";

    //Look for colour - the period is from 0 A.D. The array is not necessary - too much un useful info

            calcYearColour = putYear%10;
        if (calcYearColour == 0) {colour  = "White Metal";
        } else if (calcYearColour == 1) {colour  = "White Metal";
        } else if (calcYearColour == 2) {colour  = "Blue Water";
        } else if (calcYearColour == 3) {colour  = "Blue Water";
        } else if (calcYearColour == 4) {colour  = "Green Wood";
        } else if (calcYearColour == 5) {colour  = "Green Wood";
        } else if (calcYearColour == 6) {colour  = "Red Fire";
        } else if (calcYearColour == 7) {colour  = "Red Fire";
        } else if (calcYearColour == 8) {colour  = "Yellow Earth";
        } else if (calcYearColour == 9) {colour  = "Yellow Earth";}
      //  } else colour = "unknown colour";

        //Output data
        if (putYear < UIUtils.getCurrentYear() && putYear >=0) {
            System.out.println("Year " + putYear + " was the year of " + colour + " "+ animal );
        } else if (putYear > UIUtils.getCurrentYear()) {
            System.out.println("Year " + putYear + " would be the year of " + colour + " "+ animal );
        } else if (putYear < 0){
            System.out.println("Please enter the year in AD format - bigger or equal 0" );
        }else System.out.println("Year " + putYear + " is the year of " + colour + " "+ animal );


//System.out.println("Year " + putYear + " was the year of " + colour + " "+ animal );

        }
    }



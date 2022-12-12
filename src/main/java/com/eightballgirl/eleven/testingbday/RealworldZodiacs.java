package com.eightballgirl.eleven.testingbday;

import java.util.ArrayList;

public class RealworldZodiacs {

    //methods:
    //getZodiac(month,day)
    //get

    //zodiac dates:
    //    Aries (March 21 – April 19)
    //    Taurus (April 20 – May 20)
    //    Gemini (May 21 – June 20)
    //    Cancer (June 21 – July 22)
    //    Leo (July 23 – August 22)
    //    Virgo (August 23 – September 22)
    //    Libra (September 23 – October 22)
    //    Scorpio (October 23 – November 21)
    //    Sagittarius (November 22 – December 21)
    //    Capricorn (December 22 – January 19)
    //    Aquarius (January 20 – February 18)
    //    Pisces (February 19 – March 20)

    //long way:
    //determine each zodiac for each day

    //other ways:
    //have a nested class for each zodiac
    //inside do a for loop to instantiate the numbers for the zodiac.

    //if ( string || string || string )

    //December 31

    //instantiate what th emotnh is
    //have an array of the month and day combos
    //go through a for loop, determine which zodiac the month belongs to.


    //if zodiac = aries, break and set zodiac to "aries"

    public RealworldZodiacs() {
    }

    private String determineZodiac(String birthdayfull) {
        String zodiac = "";

        //Aries
        if (birthdayfull.equals("") ||
                birthdayfull.equals("a")
        ) {
            return "Aries";

        }

        if (isAries(birthdayfull)) {

        }

        return zodiac;
    }

    private boolean isZode() {

        return false;
    }

    public boolean isAries(String bday) {
        //Aries (March 21 – April 19)
        boolean returnvalue = false;

        ArrayList<String> ariesdays = new ArrayList<>();

        for (int i = 21; i <= 31; i++) {
            ariesdays.add("March " + i);
        }
        for (int i = 1; i <= 19; i++) {
            ariesdays.add("April "+ i);
        }

        if (ariesdays.contains(bday)){
            returnvalue = true;
        }

        return returnvalue;
    }
    public boolean isTaurus(String bday) {
        //Aries (March 21 – April 19)
        boolean returnvalue = false;

        ArrayList<String> taurusdays = new ArrayList<>();

        for (int i = 21; i <= 31; i++) {
            taurusdays.add("March " + i);
        }
        for (int i = 1; i <= 19; i++) {
            taurusdays.add("April "+ i);
        }

        if (taurusdays.contains(bday)){
            returnvalue = true;
        }

        return returnvalue;
    }
}

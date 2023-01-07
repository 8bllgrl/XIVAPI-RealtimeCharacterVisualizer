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

    public String determineZodiac(String birthdayfull) {
        String zodiac = "";

        //Aries
        if (isAries(birthdayfull)) {
            zodiac = "Aries";
        } else if (isTaurus(birthdayfull)) {
            zodiac = "Taurus";
        } else if (isGemini(birthdayfull)) {
            zodiac = "Gemini";
        } else if (isCancer(birthdayfull)) {
            zodiac = "Cancer";
        } else if (isLeo(birthdayfull)) {
            zodiac = "Leo";
        } else if (isVirgo(birthdayfull)) {
            zodiac = "Virgo";
        } else if (isLibra(birthdayfull)) {
            zodiac = "Libra";
        } else if (isScorpio(birthdayfull)) {
            zodiac = "Scorpio";
        } else if (isSagittarius(birthdayfull)) {
            zodiac = "Sagittarius";
        } else if (isCapricorn(birthdayfull)) {
            zodiac = "Capricorn";
        } else if (isAquarius(birthdayfull)) {
            zodiac = "Aquarius";
        } else if (isPisces(birthdayfull)) {
            zodiac = "Pisces";
        }else {
            zodiac = "No zodiac.";
        }

        return zodiac;
    }

    private boolean isAries(String bday) {
        //Aries (March 21 – April 19)
        boolean returnvalue = false;

        ArrayList<String> ariesdays = new ArrayList<>();

        for (int i = 21; i <= 31; i++) {
            ariesdays.add("March " + i);
        }
        for (int i = 1; i <= 19; i++) {
            ariesdays.add("April " + i);
        }

        if (ariesdays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isTaurus(String bday) {
        //Taurus (April 20 – May 20)
        boolean returnvalue = false;

        ArrayList<String> taurusdays = new ArrayList<>();

        for (int i = 20; i <= 30; i++) {
            taurusdays.add("April " + i);
        }
        for (int i = 1; i <= 20; i++) {
            taurusdays.add("May " + i);
        }


        if (taurusdays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isGemini(String bday) {
        //Gemini (May 21 – June 20)
        boolean returnvalue = false;

        ArrayList<String> geminidays = new ArrayList<>();


        for (int i = 21; i <= 31; i++) {
            geminidays.add("May " + i);
        }
        for (int i = 1; i <= 20; i++) {
            geminidays.add("June " + i);
        }


        if (geminidays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isCancer(String bday) {
        //Cancer (June 21 – July 22)
        boolean returnvalue = false;

        ArrayList<String> cancerdays = new ArrayList<>();

        for (int i = 21; i <= 31; i++) {
            cancerdays.add("June " + i);
        }
        for (int i = 1; i <= 22; i++) {
            cancerdays.add("July " + i);
        }


        if (cancerdays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isLeo(String bday) {
        //Leo (July 23 – August 22)
        boolean returnvalue = false;

        ArrayList<String> leoDays = new ArrayList<>();


        for (int i = 23; i <= 31; i++) {
            leoDays.add("July " + i);
        }
        for (int i = 1; i <= 22; i++) {
            leoDays.add("August " + i);
        }


        if (leoDays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isVirgo(String bday) {
        //(August 23 – September 22)
        boolean returnvalue = false;

        ArrayList<String> virgodays = new ArrayList<>();


        for (int i = 23; i <= 31; i++) {
            virgodays.add("August " + i);
        }
        for (int i = 1; i <= 22; i++) {
            virgodays.add("September " + i);
        }


        if (virgodays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isLibra(String bday) {
        //(September 23 – October 22)
        boolean returnvalue = false;

        ArrayList<String> libradays = new ArrayList<>();


        for (int i = 23; i <= 31; i++) {
            libradays.add("September " + i);
        }
        for (int i = 1; i <= 22; i++) {
            libradays.add("October " + i);
        }


        if (libradays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isScorpio(String bday) {
        //(October 23 – November 21)
        boolean returnvalue = false;

        ArrayList<String> scorpioday = new ArrayList<>();


        for (int i = 23; i <= 31; i++) {
            scorpioday.add("October " + i);
        }
        for (int i = 1; i <= 21; i++) {
            scorpioday.add("November " + i);
        }


        if (scorpioday.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isSagittarius(String bday) {
        //((November 22 – December 21)
        boolean returnvalue = false;

        ArrayList<String> sagittariusDays = new ArrayList<>();


        for (int i = 22; i <= 31; i++) {
            sagittariusDays.add("November " + i);
        }
        for (int i = 1; i <= 21; i++) {
            sagittariusDays.add("December " + i);
        }


        if (sagittariusDays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isCapricorn(String bday) {
        //(December 22 – January 19)
        boolean returnvalue = false;

        ArrayList<String> capricorndays = new ArrayList<>();


        for (int i = 22; i <= 31; i++) {
            capricorndays.add("December " + i);
        }
        for (int i = 1; i <= 19; i++) {
            capricorndays.add("January " + i);
        }


        if (capricorndays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isAquarius(String bday) {
        //(January 20 – February 18)
        boolean returnvalue = false;

        ArrayList<String> aquadays = new ArrayList<>();


        for (int i = 20; i <= 31; i++) {
            aquadays.add("January " + i);
        }
        for (int i = 1; i <= 18; i++) {
            aquadays.add("February " + i);
        }


        if (aquadays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }

    private boolean isPisces(String bday) {
        //(February 19 – March 20)
        boolean returnvalue = false;

        ArrayList<String> piscesDays = new ArrayList<>();


        for (int i = 19; i <= 31; i++) {
            piscesDays.add("February " + i);
        }
        for (int i = 1; i <= 20; i++) {
            piscesDays.add("March " + i);
        }


        if (piscesDays.contains(bday)) {
            returnvalue = true;
        }

        return returnvalue;
    }
}


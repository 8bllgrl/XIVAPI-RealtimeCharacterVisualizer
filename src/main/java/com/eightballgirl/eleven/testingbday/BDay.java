package com.eightballgirl.eleven.testingbday;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;

public class BDay {


    /*
First astral moon: 1
First umbral moon: 2
Second astral moon: 3
Second umbral moon: 4
Third astral moon: 5
Third umbral moon: 6
Fourth astral moon: 7
Fourth umbral moon: 8
Fifth astral moon: 9
Fifth umbral moon: 10
Sixth astral moon: 11
Sixth umbral moon: 12
     */

    public static final String GET_URL = "https://xivapi.com";

    public static void main(String[] args) throws Exception {


        RealworldZodiacs zodiacs = new RealworldZodiacs();
        String birthday = "29st Sun of the 6th Astral Moon";

        int monthInt = determineBirthday_MonthNumber(birthday);
        int dayInt = determineBirthday_DayNumber(birthday);
        System.out.println(monthInt + "/" + dayInt);



        System.out.println(formatCalendarInfo(getCalendarJsonInformation(GET_URL, monthInt), dayInt, monthInt));

        //convert to a birthday.
        //https://xivapi.com/calendar/2

    }

    private static String formatCalendarInfo(String jsonString, int day, int month) throws Exception {
        String result = "";
        CalendarXIVAPI calendarXIVAPI;

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS, false);


        try {
            calendarXIVAPI = objectMapper.readValue(jsonString, CalendarXIVAPI.class);

            result = "Realworld birthday: " + determineMonthName(month) + " " + (appendRealWorldDate(day, calendarXIVAPI));
            //EXAMPLE: april 14

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

    private static int appendRealWorldDate(int day, CalendarXIVAPI calendarXIVAPI) {

        switch (day) {
            case 0:
                return calendarXIVAPI.getDay0();
            case 1:
                return calendarXIVAPI.getDay1();
            case 2:
                return calendarXIVAPI.getDay2();
            case 3:
                return calendarXIVAPI.getDay3();
            case 4:
                return calendarXIVAPI.getDay4();
            case 5:
                return calendarXIVAPI.getDay5();
            case 6:
                return calendarXIVAPI.getDay6();
        }

        day++;
                ///
        switch (day){
            case 7:
                return calendarXIVAPI.getDay7();
            case 8:
                return calendarXIVAPI.getDay8();
            case 9:
                return calendarXIVAPI.getDay9();
            case 10:
                return calendarXIVAPI.getDay10();
            case 11:
                return calendarXIVAPI.getDay11();
            case 12:
                return calendarXIVAPI.getDay12();
            case 13:
                return calendarXIVAPI.getDay13();
            case 14:
                return calendarXIVAPI.getDay14();
            case 15:
                return calendarXIVAPI.getDay15();
            case 16:
                return calendarXIVAPI.getDay16();
            case 17:
                return calendarXIVAPI.getDay17();
            case 18:
                return calendarXIVAPI.getDay18();
            case 19:
                return calendarXIVAPI.getDay19();
            case 20:
                return calendarXIVAPI.getDay20();
            case 21:
                return calendarXIVAPI.getDay21();
            case 22:
                return calendarXIVAPI.getDay22();
            case 23:
                return calendarXIVAPI.getDay23();
            case 24:
                return calendarXIVAPI.getDay24();
            case 25:
                return calendarXIVAPI.getDay25();
            case 26:
                return calendarXIVAPI.getDay26();
            case 27:
                return calendarXIVAPI.getDay27();
            case 28:
                return calendarXIVAPI.getDay28();
            case 29:
                return calendarXIVAPI.getDay29();
            case 30:
                return calendarXIVAPI.getDay30();
            case 31:
                return calendarXIVAPI.getDay31();


        }


        return 999;
    }

    private static int determineBirthday_MonthNumber(String birthday) {

        birthday = birthday.toLowerCase(Locale.ROOT);

        if (birthday.contains("1st astral moon")) {
            return 0;
        } else if (birthday.contains("1st umbral moon")) {
            return 1;
        } else if (birthday.contains("2nd astral moon")) {
            return 2;
        } else if (birthday.contains("2nd umbral moon")) {
            return 3;
        } else if (birthday.contains("3rd astral moon")) {
            return 4;
        } else if (birthday.contains("3rd umbral moon")) {
            return 5;
        } else if (birthday.contains("4th astral moon")) {
            return 6;
        } else if (birthday.contains("4th umbral moon")) {
            return 7;
        } else if (birthday.contains("5th astral moon")) {
            return 8;
        } else if (birthday.contains("5th umbral moon")) {
            return 9;
        } else if (birthday.contains("6th astral moon")) {
            return 10;
        } else if (birthday.contains("6th umbral moon")) {
            return 11;
        } else {
            return 999;
        }

    }

    public static String determineMonthName(int month) {

        switch (month) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
        }

        return "No month exists with the number " + month;
    }

    private static String determineBirthday_CalendarNum(String birthday) {
        //only look for the first two characters
        birthday = birthday.substring(0, 2);
        //if the characters are "1s" or "2n" etc, then remove the char at the end.
        if (birthday.matches(".*[a-zA-Z]+.*")) {
            birthday = birthday.substring(0, 1);
        }
        //the number of the birthday = parse int, minus one to match with the api database.
        int num = Integer.parseInt(birthday) - 1;

        return birthday;
    }

    private static int determineBirthday_DayNumber(String birthday) {
        //only look for the first two characters
        birthday = birthday.substring(0, 2);
        //if the characters are "1s" or "2n" etc, then remove the char at the end.
        if (birthday.matches(".*[a-zA-Z]+.*")) {
            birthday = birthday.substring(0, 1);
        }
        //the number of the birthday = parse int, minus one to match with the api database.
        int num = Integer.parseInt(birthday)-1;

        return num;
    }

    private static String thiss_getURLResponse(String URLString) throws Exception {
        if (URLString != null) {

            //1.
            HttpClient client = HttpClient.newHttpClient();
            URI uri = URI.create(URLString);

            //2.
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            //3.
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

            //4.
            int statusCode = httpResponse.statusCode();
            if (statusCode == 200) {
                return httpResponse.body(); //RETURNS IN JSON FORMAT.
            } else {
                return String.format("GET request failed: %d status code received", statusCode);
            }


        } else {
            throw new Exception("Something went wrong.");
        }
    }

    public static String getCalendarJsonInformation(String URL, int monthint) throws Exception {
        String completeURL = URL + "/calendar/" + monthint;
        return thiss_getURLResponse(completeURL);
    }


}

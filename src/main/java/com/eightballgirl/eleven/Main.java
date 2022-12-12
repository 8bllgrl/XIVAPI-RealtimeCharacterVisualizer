package com.eightballgirl.eleven;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;
import java.util.Objects;

public class Main {


    public static final String GET_URL = "https://xivapi.com";
    public static boolean waiting = false;


    public static void bufferCorrection() throws InterruptedException {
        //this is to make sure i dont get banned from the API.
        System.out.print(". ");
        waiting = true;
        Thread.sleep(1000);
        waiting = false;
    }

    public static String this_getURLResponse(String URLString) throws Exception {
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

    public static String getCharacter_LodestoneID(String URL, String characterID) throws Exception {
        String completeUrl = URL + "/character/" + characterID;

        return this_getURLResponse(completeUrl);
    }

    public static String ERR_printNoGlamFound() {
        return "No glamour equipped.";
    }

    public static void appendGlamorType(String glamType, ObjectMapper objectMapper, StringBuilder resultingOutput, XIVCharacterClass xivCharacter) throws Exception {
        glamType = glamType.toLowerCase(Locale.ROOT);

        ItemClass item;
        String itemJsonString = null;
        String dyeColor = null;

        int tempStart = 0;
        int tempEnd = 0;


        switch (glamType) {
            case "head":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getHead().getMirage());

                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getHead().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;
            case "body":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getBody().getMirage());
                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getBody().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;
            case "legs":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getLegs().getMirage());
                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getLegs().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;
            case "shoes":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getFeet().getMirage());
                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getFeet().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;
            case "hands":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getHands().getMirage());
                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getHands().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;
            case "mainhand":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getMainHand().getMirage());
                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getMainHand().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;
            case "necklace":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getNecklace().getMirage());
                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getNecklace().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;
            case "earrings":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getEarrings().getMirage());
                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getEarrings().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;
            case "bracelets":
                itemJsonString = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getBracelets().getMirage());
                dyeColor = getItemJsonString(xivCharacter.getCharacter().getGearSet().getGear().getBracelets().getDye());
                tempStart = dyeColor.indexOf("\"Name\":");
                tempEnd = dyeColor.indexOf(",", dyeColor.indexOf("\"Name\":"));
                dyeColor = dyeColor.substring(tempStart, tempEnd)
                        .replace("\"Name\":", "")
                        .replace("\"", "")
                ;
                break;

        }

        //Appending.

        item = objectMapper.readValue(itemJsonString, ItemClass.class);

        if (dyeColor == ""){
            dyeColor = "Un-dyed.";

        }

        resultingOutput.append(glamType.toUpperCase() + ": ");
        if (item.getName() == "") {
            resultingOutput
                    .append(ERR_printNoGlamFound())
                    .append("\n")
            ;
        } else {
            resultingOutput
                    .append(item.getName())
                    .append(" --- Dye: ")
                    .append(dyeColor)
                    .append("\n")
            ;
        }

    }

    public static void appendGlamor(StringBuilder resultingOutput, XIVCharacterClass xivCharacter, String itemJsonString, ObjectMapper objectMapper) throws Exception {

        resultingOutput
                .append("\n")
                .append("----~~ Current Glamour ~~----")
                .append("\n")
                .append("\n")
        ;

        appendGlamorType("head", objectMapper, resultingOutput, xivCharacter);
        bufferCorrection();
        appendGlamorType("body", objectMapper, resultingOutput, xivCharacter);
        bufferCorrection();
        appendGlamorType("hands", objectMapper, resultingOutput, xivCharacter);
        bufferCorrection();
        appendGlamorType("legs",objectMapper,resultingOutput,xivCharacter);
        bufferCorrection();
        appendGlamorType("shoes",objectMapper,resultingOutput,xivCharacter);
        bufferCorrection();
        appendGlamorType("earrings",objectMapper,resultingOutput,xivCharacter);
        bufferCorrection();
        appendGlamorType("bracelets",objectMapper,resultingOutput,xivCharacter);
        bufferCorrection();
        appendGlamorType("necklace",objectMapper,resultingOutput,xivCharacter);
        bufferCorrection();
        appendGlamorType("mainhand",objectMapper,resultingOutput,xivCharacter);

    }

    public static String formatCharacterOutput(String jsonString) throws Exception {
        StringBuilder resultingOutput = new StringBuilder();
        XIVCharacterClass xivCharacter;
        ItemClass item;


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS, false);

        try {
            xivCharacter = objectMapper.readValue(jsonString, XIVCharacterClass.class);

            //for each item, change the variable of the item string to be the new item, as well as updating the item to be the new item.
            String itemJsonString = "";


            //
            String formattedGender = formatGender(xivCharacter.getCharacter().getGender());
            String formattedRace = formatRace(xivCharacter.getCharacter().getRace());
            String formattedDeity = formatDeity(xivCharacter.getCharacter().getGuardianDeity());
            //


//            formattingOne(resultingOutput);


            //Building output.
            //Append: name, race gender
            resultingOutput
                    .append("\n")

                    .append("\n")
                    .append("----~~ Character Traits ~~----")
                    .append("\n")
                    .append("\n")

                    .append("Name: ")
                    .append(xivCharacter.getCharacter().getName())
                    .append("\n")

                    .append("Race: ")
                    .append(formattedRace)
                    .append("\n")

                    .append("Gender: ")
                    .append(formattedGender)
                    .append("\n")

                    .append("Gender: ")
                    .append(formattedGender)
                    .append("\n")

                    .append("Birthday \\\\\\ Nameday: ")
                    .append(xivCharacter.getCharacter().getNameday())
                    .append("\n")

                    .append("Guardian Diety: ")
                    .append(formattedDeity)
                    .append("\n")

                    .append("Gender:")
                    .append(xivCharacter.getCharacter())
                    .append("\n")

                    .append("Gender:")
                    .append(xivCharacter.getCharacter())
                    .append("\n")
            ;

            //Append: Bio, if it exists.
            if (xivCharacter.getCharacter().getBio() != null && !Objects.equals(xivCharacter.getCharacter().getBio(), "-")) {
                resultingOutput.append("Bio:" + xivCharacter.getCharacter().getBio())
                        .append("\n")
                ;
            }

            //Append: Glamours.
            appendGlamor(resultingOutput, xivCharacter, itemJsonString, objectMapper);


        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("No character found");

        }

        return resultingOutput.toString();
    }


    private static String formatDeity(int guardianDeity) {

        if (guardianDeity == 1) {
            return "Halone";
        } else if (guardianDeity == 2) {
            return "Menphina";
        } else if (guardianDeity == 3) {
            return "Thaliak";
        } else if (guardianDeity == 4) {
            return "Nymeia";
        } else if (guardianDeity == 5) {
            return "Llymlaen";
        } else if (guardianDeity == 6) {
            return "Oschon";
        } else if (guardianDeity == 7) {
            return "Byregot";
        } else if (guardianDeity == 8) {
            return "Rhalgr";
        } else if (guardianDeity == 9) {
            return "Azeyma";
        } else if (guardianDeity == 10) {
            return "Nald'thal";
        } else if (guardianDeity == 11) {
            return "Nohpica";
        } else if (guardianDeity == 12) {
            return "Althyk";
        }
        return "?<Deity not found>?";
    }


    private static String formatGender(int genderString) {
        if (genderString == 1) {
            return "Male";
        } else {
            return "Female";
        }
    }

    private static String formatRace(int raceNumber) {

        if (raceNumber == 1) {
            return "Hyur";
        } else if (raceNumber == 2) {
            return "Elezen";
        } else if (raceNumber == 3) {
            return "Lalafell";
        } else if (raceNumber == 4) {
            return "Miqo'te";
        } else if (raceNumber == 5) {
            return "Roegadyn";
        } else if (raceNumber == 6) {
            return "Au Ra";
        } else if (raceNumber == 7) {
            return "Hrothgar";
        } else if (raceNumber == 8) {
            return "Viera";
        }
        return "?Race Not Detected?";
    }

    private static void formatRaceClan() {

    }


    private static String getItemJsonString(int itemNum) throws Exception {
        String finalURL = "https://xivapi.com/item/" + itemNum;
        return this_getURLResponse(finalURL);
    }

    public static String getFievelCharacter() throws Exception {
        String finalURL = "https://xivapi.com/character/42825794";
        return this_getURLResponse(finalURL);
    }

    public static String getAngeloCharacter() throws Exception {
        String finalURL = "https://xivapi.com/character/42512053";

        return this_getURLResponse(finalURL);
    }

    public static void main(String[] args) {


        //This is where we use souts.
        try {

            System.out.println(">");
            System.out.println("Loading... This might take a few seconds.");
            System.out.println();
            System.out.println(formatCharacterOutput(getCharacter_LodestoneID(GET_URL, "42825794")));


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

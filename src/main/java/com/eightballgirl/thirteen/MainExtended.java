package com.eightballgirl.thirteen;

import com.eightballgirl.eleven.ItemClass;
import com.eightballgirl.eleven.XIVCharacterClass;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

public class MainExtended {

    public static final String GET_URL = "https://xivapi.com";
    public static boolean waiting = false;


    public static void bufferCorrection() throws InterruptedException {
        //this is to make sure i dont get banned from the API.
        System.out.print(". ");
        waiting = true;
        Thread.sleep(1000);
        waiting = false;
    }

    private static String this_getURLResponse(String URLString) throws Exception {
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

    private static String formatGender(int genderString) {
        if (genderString == 1) {
            return "Male";
        } else {
            return "Female";
        }
    }

    private static void configureObjectMapper(ObjectMapper objectMapper) {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS, false);
    }

    public static String formatCharacterOutput(String jsonString) throws Exception {
        StringBuilder resultingOutput = new StringBuilder();
        XIVCharacterClass XIVCharacterClass;

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS, false);


        try {
            XIVCharacterClass = objectMapper.readValue(jsonString, XIVCharacterClass.class);

            String itemJsonString = "";
//            String formattedGender = formatGender(XIVCharacterClass.getCharacter().getGender());

            resultingOutput
                    .append("\n")
                    .append("----~~ Character Traits ~~----")
                    .append("\n")
                    .append("Name: ")
                    .append(XIVCharacterClass.getCharacter().getName())
            ;


        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("No character found");
        }

        return resultingOutput.toString();
    }


    public static void main(String[] args) {

        try {
            System.out.println(">");
            System.out.println();
            System.out.println();
            System.out.println(formatCharacterOutput(getCharacter_LodestoneID(GET_URL, "1")));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

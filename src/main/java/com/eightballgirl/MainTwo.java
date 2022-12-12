package com.eightballgirl;

import com.eightballgirl.dto.XIVCharacterTwo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.eightballgirl.Main.sendGET;


//System.out.println(cluesDTO.getClues().get(randomNumber_to100).getCategory().getTitle());

public class MainTwo {

    static XIVCharacterTwo xivCharacter;
    static final String GET_XIVAPI_URL = "https://xivapi.com";
    static final String GET_CHARA_URL = "https://xivapi.com/character/";

    public static void main(String[] args) throws Exception {
        //getURLResponse
        //return getURLResponse(completeUrl);

        sendGET(GET_CHARA_URL);
        String response = sendGET(GET_CHARA_URL);
        ObjectMapper objectMapper = new ObjectMapper();
        xivCharacter = objectMapper.readValue(response, XIVCharacterTwo.class);

        String string = xivCharacter.getCharacter().getName();
    }

    public static void initChara() throws JsonProcessingException {
        sendGET(GET_CHARA_URL);
        String response = sendGET(GET_CHARA_URL);
        ObjectMapper objectMapper = new ObjectMapper();
        XIVCharacterTwo xivCharacter = objectMapper.readValue(response, XIVCharacterTwo.class);
    }

    public static String getName(String URL) throws Exception {
        String completeUrl = URL;
        //turn this into a json
        return getURLResponse(completeUrl);
    }

    public static String getURLResponse(String URLString) throws Exception {
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

    public static String formatActivityOutput(String jsonString) throws Exception {
        String resultingOutput;
        XIVCharacterTwo activityObj;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            activityObj = objectMapper.readValue(jsonString, XIVCharacterTwo.class);
            resultingOutput =
                    "Name: " + activityObj.getCharacter().getName() + "\n";
//                            "Type: " + activityObj.getType() + "\n" +
//                            "Participants: " + activityObj.getParticipants() + "\n" +
//                            "Price: " + activityObj.getPrice() + "\n"
            ;

        } catch (Exception e) {
            throw new Exception("Failure found");
        }
        return resultingOutput;
    }


}

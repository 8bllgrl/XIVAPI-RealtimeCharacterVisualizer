package com.eightballgirl;

import com.eightballgirl.dto.XIVCharacter;
import com.eightballgirl.dto.XIVCharacterTwo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    static final String GET_XIVAPI_URL = "https://xivapi.com";
    static final String GET_CHARA_URL = "https://xivapi.com/character/";

    //This is the main program. This is just a test program so it does not need to be too advanced in order to work.


    public static void main(String[] args){

//        String tempString = formatURL("42825794");
//        System.out.println();
//
//        System.out.println(tempString);
//
//        XIVCharacterTwo xivCharacter = new XIVCharacterTwo();
//
//        System.out.println(getURLResponseJsonFormat(tempString));
//        System.out.println(xivCharacter.getCharacter().getName());

        try{
            initChara();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("failure.");
        }


    }

    public static void initChara() throws JsonProcessingException {

        sendGET(GET_CHARA_URL);
        String response = sendGET(GET_CHARA_URL);
        ObjectMapper objectMapper = new ObjectMapper();
        XIVCharacterTwo xivCharacter = objectMapper.readValue(response,XIVCharacterTwo.class);
    }

    public static String formatURL(String characterID) {
        String queryString = GET_CHARA_URL + characterID;
        return queryString;
    }
    public static String sendGET(String URLString) {
        //** Start of GET request algorithm

        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(URLString);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();

        try {
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if (statusCode == 200) {
                return httpResponse.body();
            } else {
                return String.format("GET request failed: %d status code received", statusCode);
            }
        } catch (IOException | InterruptedException e) {
            return e.getMessage();
        }


    }

    public static String getURLResponseJsonFormat(String URLString) throws Exception {
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

    public static String getName(String URL) throws Exception {
        String completeUrl = URL;
        //turn this into a json
        return getURLResponseJsonFormat(completeUrl);
    }

}

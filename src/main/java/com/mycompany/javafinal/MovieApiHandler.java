/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafinal;

/**
 *
 * @author teoberbic
 */
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//class to get and parse information for Movie class
public class MovieApiHandler {
    
    
    public static Movie UrlOpener(String Url){
        
        //code adapted from: https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
        
        try {
            String apiUrl = Url;

            //make a HTTP request
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            //read the response from the request if the connection is ok
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                
                //while there are things to read, read them and append them to line
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                
                //parse the JSON response into my Movie class using Gson
                Gson gson = new Gson();
                return gson.fromJson(response.toString(), Movie.class);
               
              //if the response is not ok print out that there is an error
            } else {
                System.out.println("HTTP request failed with response code: " + responseCode);
            }
            
            connection.disconnect();
        } catch (Exception e) { //exception here is Exception because it is caught in HomeWindow if search is bad
                    
        }
         return null;
    }
    
    //end code from above url
    
}



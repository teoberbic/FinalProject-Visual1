/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafinal;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

/**
 *
 * @author teoberbic
 */
//class to get popular movies 
public class MovieAPIPopularHandler {
    //declare fields I need from popular movies
    private String title;
    @SerializedName("poster_path")
    private String posterPath;
    
    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return posterPath;
    }

    public void setPosterPath(String poster) {
        this.posterPath = poster;
    }
    //method to get the popular movies from the api
    public static String getPopular() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.themoviedb.org/3/movie/popular?language=en-US&page=1"))
            .header("accept", "application/json")
            .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0OTNjOTZmNzhlOTA1YTE0ODljZWUzZjI3ZjQ1M2MwMCIsInN1YiI6IjY1NzI0MGQwZjI4ODM4MDBlMjU5NjExYSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.s8twLReb7MFYLVXlUKc6skGcLOblxypUuAvlwVpnOkY")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    //method to parse the results of the popular movies after gaining the information api
    public static List<MovieAPIPopularHandler> parsePopularResults(String jsonResponse) {
         Gson gson = new Gson();
        //parse movie in PopularMovie class
        PopularMovie movie = gson.fromJson(jsonResponse, PopularMovie.class);
        return movie.getResults(); //return results to HomeWindow
    } 
}

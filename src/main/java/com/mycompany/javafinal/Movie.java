/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafinal;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author teoberbic
 */
//class to hold all parsed information about a single movie
public class Movie {
    private String Title;
    private String Year;
    private String Director;
    @SerializedName("Released")
    private String ReleaseDate;
    private String Runtime;
    private String Genre;
    @SerializedName("Actors")
    private String Cast;
    @SerializedName("Rated")
    private String Rating;
    private String RottenTomatoes;
    @SerializedName("BoxOffice")
    private String BoxOffice;
    private String Poster;
    private String Plot;
    

    // Getters and setters for fields

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }
    
     public String getRating() {
        return Rating;
    }
     
    public void setRating(String Rating) {
        this.Rating = Rating;
    }
    
   public String getCast() {
       return Cast;
   }
   
   public void setCast(String cast) {
       this.Cast = cast;
   }
   
   public String getReleaseDate() {
       return ReleaseDate;
   }
   
   public void setreleaseDate(String releaseDate) {
       this.ReleaseDate = releaseDate;
   }
   
   public String getRuntime() {
       return Runtime;
   }
   
   public void setRuntime(String Runtime) {
       this.Runtime = Runtime;
   }
   
    public String getGenre() {
       return Genre;
   }
   
   public void setGenre(String Genre) {
       this.Genre = Genre;
   }
   
   public String getBoxOffice() {
       return BoxOffice;
   }
   
   public void setBoxOffice(String BoxOffice) {
       this.BoxOffice = BoxOffice;
   }
   
   public String getPoster() {
       return Poster;
   }
   
   public void setPoster(String Poster) {
       this.Poster = Poster;
   }
   
   public String getPlot() {
        return Plot;
    }

    public void setPlot(String Plot) {
        this.Plot = Plot;
    }
    
    
}


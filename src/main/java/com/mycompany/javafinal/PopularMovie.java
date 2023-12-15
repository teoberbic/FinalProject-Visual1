/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafinal;

import java.util.List;



/**
 *
 * @author teoberbic
 */

//class to get the page and list of results of type Popular movie
public class PopularMovie {
    private int page;
    private List<MovieAPIPopularHandler> results;
  
    
    public int getPage() {
        return this.page;
    }
    
    public void setPage(int page) {
        this.page = page;
    }
    
    public List<MovieAPIPopularHandler> getResults() {
        return this.results;
    }
    
    public void setResults(List<MovieAPIPopularHandler> results) {
        this.results = results;
    }
}

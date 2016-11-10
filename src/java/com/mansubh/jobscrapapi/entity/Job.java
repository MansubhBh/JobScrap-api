/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mansubh.jobscrapapi.entity;

/**
 *
 * @author mansubh
 */
public class Job {
    private String title;
    private String category,posType,expr,education,city;
    private String openings;

    public Job() {
    }

    public Job(String title, String category, String posType, String expr, String education, String city, String openings) {
        this.title = title;
        this.category = category;
        this.posType = posType;
        this.expr = expr;
        this.education = education;
        this.city = city;
        this.openings = openings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPosType() {
        return posType;
    }

    public void setPosType(String posType) {
        this.posType = posType;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOpenings() {
        return openings;
    }

    public void setOpenings(String openings) {
        this.openings = openings;
    }
    
    
    
}

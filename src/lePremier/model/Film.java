package lePremier.model;

import lePremier.calculator.Classification;

public class Film extends Title implements Classification {
    private String director;

    public String getDirector(){
        return this.director;
    }
    public void setDirector(String director){
        this.director=director;
    }

    @Override
    public int getClassification() {
        return (int)ratingAverage()/2;
    }
}


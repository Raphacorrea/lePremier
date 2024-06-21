package lePremier.model;

import lePremier.calculator.Classification;

public class Film extends Title implements Classification {
    private String director;

    public Film(String name, int releaseYear) {
        super(name, releaseYear);
    }

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

    @Override
    public String toString() {
        return "Film: " + this.getName()+ " (" + this.getReleaseYear() + ")\n" ;
    }
}


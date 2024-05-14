package lePremier.model;

import lePremier.calculator.Classification;

public class Episode implements Classification {

    private int number;
    private String name;
    private Serie serie;
    //referencia de serie do episodio
    private int totalView;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }


    public int getTotalView() {
        return totalView;
    }

    public void setTotalView(int totalView) {
        this.totalView = totalView;
    }

    @Override
    public int getClassification() {
        if (totalView < 100) {
            return 4;
        }else{
            return 2;
        }
    }
}





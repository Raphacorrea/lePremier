package lePremier.calculator;

import lePremier.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }


    public void include(Title title){
    this.totalTime+=title.getMinutes();
    }

}





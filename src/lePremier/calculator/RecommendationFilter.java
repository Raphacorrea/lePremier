package lePremier.calculator;

public class RecommendationFilter {


    public void filter(Classification classification){
        if(classification.getClassification()>=4){
            System.out.println("\nThis is among favorites. Enjoy!");
        } else if (classification.getClassification() >= 2) {
            System.out.println("\nNice choice! This is well rated at all times. \nGrab your popcorn!");
        }else{
            System.out.println("\nSave to watch later.");
        }
    }


}

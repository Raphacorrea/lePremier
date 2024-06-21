package lePremier.model;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseYear;
    private boolean partOfThePlan;
    private double ratingsSum;
    private int ratingsTotal;
    private int minutes;

    public Title(String name, int releaseYear){
        this.name=name;
        this.releaseYear=releaseYear;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    public boolean getPartOfThePlan(){
        return this.partOfThePlan;
    }
    public void setPartOfThePlan(boolean partOfThePlan){
        this.partOfThePlan=partOfThePlan;
    }
    public int getRatingsTotal(){
        return this.ratingsTotal;
    }

    public void showMore(){
        System.out.println("Name of the film: "+name);
        System.out.println("Released in: "+ releaseYear);
        System.out.println("Minutes: "+minutes);
        System.out.println("Part of the plan: "+partOfThePlan);
    }
    public void rate(double rate){
        ratingsSum+=rate;
        ratingsTotal++;
    }
    public double ratingAverage(){
        return ratingsSum / ratingsTotal;
    }
//method required to compare title with title from comparable
    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}


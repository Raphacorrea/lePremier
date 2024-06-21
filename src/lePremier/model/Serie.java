package lePremier.model;

public class Serie extends Title{

    private int seasons;
    private int episodesPerSeason;
    private boolean active;
    private int minutesPerEpisode;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons(){
        return seasons;
    }

    public void setSeasons(int seasons){
        this.seasons=seasons;
    }

    public int getEpisodesPerSeason(){
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason){
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode(){
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode){
        this.minutesPerEpisode = minutesPerEpisode;
    }
    @Override
    public int getMinutes(){
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName()+ "(" + this.getReleaseYear() + ")";
    }
}

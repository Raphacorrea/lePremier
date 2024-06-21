package lePremier.main;

import lePremier.calculator.RecommendationFilter;
import lePremier.calculator.TimeCalculator;
import lePremier.model.Episode;
import lePremier.model.Film;
import lePremier.model.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Film myFilm = new Film("The nun", 2018);
            myFilm.setMinutes(96);
            myFilm.setPartOfThePlan(true);

            myFilm.showMore();
            myFilm.rate(8);
            myFilm.rate(10);
            myFilm.rate(6);
            System.out.println("Rating total :" + myFilm.getRatingsTotal());
            System.out.println(myFilm.ratingAverage());

            Film film2=new Film("The Nun II", 2023);
            film2.setMinutes(110);
            myFilm.setPartOfThePlan(false);

            //film2.showMore();

            Serie mySerie = new Serie("Midnight Mass", 2021);
            mySerie.setSeasons(1);
            mySerie.setEpisodesPerSeason(7);
            mySerie.showMore();
            mySerie.setMinutesPerEpisode(65);
            mySerie.setPartOfThePlan(true);
            System.out.println("Binge watch needed time: "+mySerie.getMinutes());

            Serie serie1 = new Serie("The Haunting of Hill House", 2018);
            Serie serie2 = new Serie("The Haunting of Bly Manor", 2020);

            TimeCalculator calculator = new TimeCalculator();
            calculator.include(mySerie);
            calculator.include(myFilm);
            calculator.include(film2);

            Episode episode = new Episode();
            episode.setName("Book I: Genesis");
            episode.setTotalView(300);
            episode.setSerie(mySerie);


            RecommendationFilter filtering = new RecommendationFilter();
            filtering.filter(myFilm);
            filtering.filter(film2);
            filtering.filter(episode);




    }
}


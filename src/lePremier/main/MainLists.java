package lePremier.main;

import lePremier.model.Film;
import lePremier.model.Serie;
import lePremier.model.Title;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {
        Film myFilm = new Film("The nun", 2018);
        var film2=new Film("The Nun II", 2023);
        Serie mySerie = new Serie("Midnight Mass", 2021);

        ArrayList<Title> list = new ArrayList<>();
        list.add(myFilm);
        list.add(film2);
        list.add(mySerie);

        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof  Film film && film.getClassification() > 2){
                System.out.println("Classification: "+film.getClassification());
            }

    }
        List<String> searchForActor = new LinkedList<>();
        searchForActor.add("Taissa Farmiga");
        searchForActor.add("Bonnie Aarons");
        searchForActor.add("Kate Siegel");
        System.out.println("Before Sort: "+searchForActor);

        Collections.sort(searchForActor);
        System.out.println("After sort: "+searchForActor);

        Collections.sort(list);
        System.out.println("Movies list ordered by name: \n"+list);
        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Movies list ordered by release year: \n"+list);



}}


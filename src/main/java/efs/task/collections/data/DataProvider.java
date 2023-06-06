package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {
        List<Town> towns = new ArrayList<>(Data.baseTownsArray.length);

        for (String town : Data.baseTownsArray) {
            String[] townSplited = town.split(DATA_SEPARATOR);
            towns.add(new Town(townSplited[0].trim(), List.of(townSplited[1].trim(), townSplited[2].trim())));
        }

        return towns;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList() {
        List<Town> towns = new ArrayList<>(Data.dlcTownsArray.length);

        for (String town : Data.dlcTownsArray) {
            String[] townSplited = town.split(DATA_SEPARATOR);
            towns.add(new Town(townSplited[0].trim(), List.of(townSplited[1].trim(), townSplited[2].trim())));
        }

        return towns;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet() {
        Set<Hero> heroesSet = new HashSet<>();

        for (String characterData : Data.baseCharactersArray) {
            String[] characterDataSplit = characterData.split(DATA_SEPARATOR);
            Hero newHero = new Hero(characterDataSplit[0].trim(), characterDataSplit[1].trim());
            heroesSet.add(newHero);
        }

        return heroesSet;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> heroesSet = new HashSet<>();

        for (String characterData : Data.dlcCharactersArray) {
            String[] characterDataSplit = characterData.split(DATA_SEPARATOR);
            Hero newHero = new Hero(characterDataSplit[0].trim(), characterDataSplit[1].trim());
            heroesSet.add(newHero);
        }

        return heroesSet;
    }
}

package collectionTask;

import model.HouseBuild;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
//Старая сортировка
public class SortCollection {
    public ArrayList<HouseBuild> SortByFlats(ArrayList<HouseBuild> HB) {
        return HB.stream()
                .sorted(Comparator.comparing(HouseBuild::getCountFlats))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

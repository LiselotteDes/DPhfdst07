package be.vdab;

import java.util.ArrayList;
import java.util.List;

public class Tekening implements Figuur {
    private final List<Figuur> figuren = new ArrayList<>();
    public void addFiguur(Figuur figuur) {
        figuren.add(figuur);
    }
    @Override
    public double getOppervlakte() {
//        double oppervlakte = 0;
        /*
        Overloopt alle figuren in de huidige figuur.
        Hierbij wordt geen onderscheid gemaakt tussen tekeningen (figuren die op zich weer figuren bevatten), rechthoeken of cirkels.
        */
        return figuren.stream().mapToDouble((figuur) -> figuur.getOppervlakte()).reduce(0, (accumulator, _item) -> accumulator + _item);
    }
}

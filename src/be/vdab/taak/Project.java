package be.vdab.taak;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Project implements Kost {
    private final List<Kost> kosten = new ArrayList<>();
    public void add(Kost kost) {
        kosten.add(kost);
    }
    @Override
    public BigDecimal getPrijs() {
//        BigDecimal prijs = BigDecimal.ZERO;
//        for(Kost kost: kosten) {
//            prijs = prijs.add(kost.getPrijs());
//        }
//        return prijs;
        return kosten.stream()
                .map(kost -> kost.getPrijs())
                .reduce(BigDecimal.ZERO, (tussenResultaat, prijs) -> tussenResultaat.add(prijs));
    }
}

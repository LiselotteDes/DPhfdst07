package be.vdab.taak;
import java.math.BigDecimal;
public class Grondstofkost implements Kost {
    private final BigDecimal eenheidsprijs;
    private final BigDecimal hoeveelheid;
    public Grondstofkost(BigDecimal prijs, BigDecimal hoeveelheid) {
        this.eenheidsprijs = prijs;
        this.hoeveelheid = hoeveelheid;
    }
    @Override
    public BigDecimal getPrijs() {
        return eenheidsprijs.multiply(hoeveelheid);
    }
}

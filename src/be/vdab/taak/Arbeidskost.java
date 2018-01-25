package be.vdab.taak;
import java.math.BigDecimal;
public class Arbeidskost implements Kost {
    private BigDecimal uurloon;
    private BigDecimal aantalUren;
    public Arbeidskost(BigDecimal loon, BigDecimal uren) {
        this.uurloon = loon;
        this.aantalUren = uren;
    }
    @Override
    public BigDecimal getPrijs() {
        return uurloon.multiply(aantalUren);
    }
}

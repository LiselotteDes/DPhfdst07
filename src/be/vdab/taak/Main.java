package be.vdab.taak;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        project.add(new Grondstofkost(BigDecimal.valueOf(1000), BigDecimal.valueOf(3)));
        project.add(new Arbeidskost(BigDecimal.TEN, BigDecimal.valueOf(100)));
        Project subProject = new Project();
        subProject.add(new Grondstofkost(BigDecimal.valueOf(1000), BigDecimal.valueOf(4)));
        subProject.add(new Arbeidskost(BigDecimal.TEN, BigDecimal.valueOf(200)));
        project.add(subProject);
        System.out.println(project.getPrijs());
    }
    
}

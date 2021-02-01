package chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.type.plant;

import chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.LivingBeing;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Plant extends LivingBeing {
    String color;
    Boolean edibleForAnimals;
    Boolean isFragrant;

    public Plant(String specie, String breaths, String color, Boolean edibleForAnimals, Boolean isFragrant) {
        super(specie, breaths);
        this.color = color;
        this.edibleForAnimals = edibleForAnimals;
        this.isFragrant = isFragrant;
    }

    public void autumnEffect() {
        System.out.println("My leaves are dead during autumns");
    }

    public void springEffect() {
        System.out.println("My leaves are created again in Spring");
    }
}

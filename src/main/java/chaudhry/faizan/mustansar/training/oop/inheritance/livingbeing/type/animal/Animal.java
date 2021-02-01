package chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.type.animal;

import chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.LivingBeing;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class Animal extends LivingBeing {
    int legs;
    Boolean speaks;
    int eyes;

    public Animal(String specie, String breaths, int legs, Boolean speaks, int eyes) {
        super(specie, breaths);
        this.legs = legs;
        this.speaks = speaks;
        this.eyes = eyes;
    }

    public void makesNoise() {
        System.out.println("I am an animal and I make noise");
    }
}

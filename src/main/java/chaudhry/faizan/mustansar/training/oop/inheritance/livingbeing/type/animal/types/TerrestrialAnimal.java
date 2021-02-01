package chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.type.animal.types;

import chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.type.animal.Animal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TerrestrialAnimal extends Animal {
    Boolean isSkinUsage;
    public TerrestrialAnimal(String specie, String breaths, int legs, Boolean speaks, int eyes, Boolean isSkinUsage) {
        super(specie, breaths, legs, speaks, eyes);
        this.isSkinUsage = isSkinUsage;
    }

    public void walk() {
        System.out.println("I am a Terrestrial animal so I walk and run");
    }
}

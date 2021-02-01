package chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.type.animal.types;

import chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.type.animal.Animal;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class FlyingAnimal extends Animal {
    int numberOfWings;

    public FlyingAnimal(String specie, String breaths, int legs, Boolean speaks, int eyes, int numberOfWings) {
        super(specie, breaths, legs, speaks, eyes);
        this.numberOfWings = numberOfWings;
    }

    public void fly() {
        System.out.println("I can fly");
    }
    public void walkWhenNeeded() {
        System.out.println("I am a flying animal but I can walk on the land as well");
    }
}

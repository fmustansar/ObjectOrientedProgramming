package chaudhry.faizan.mustansar.training.oop.polymorphism.animal.type;

import chaudhry.faizan.mustansar.training.oop.polymorphism.animal.Animal;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class FlyingAnimal implements Animal {

    @Override
    public void walk() {
        System.out.println("Who walks when you can fly, though I can walk as well");
    }

    @Override
    public void makesNoise() {
        System.out.println("I chirp!!!");
    }

    @Override
    public Boolean doesItFly() {
        return true;
    }
}

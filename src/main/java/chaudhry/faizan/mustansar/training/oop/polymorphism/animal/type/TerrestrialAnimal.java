package chaudhry.faizan.mustansar.training.oop.polymorphism.animal.type;

import chaudhry.faizan.mustansar.training.oop.polymorphism.animal.Animal;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TerrestrialAnimal implements Animal {

    @Override
    public void walk() {
        System.out.println("I like to walk!!!");
    }

    @Override
    public void makesNoise() {
        System.out.println("I bark!!!");
    }

    @Override
    public Boolean doesItFly() {
        return false;
    }
}

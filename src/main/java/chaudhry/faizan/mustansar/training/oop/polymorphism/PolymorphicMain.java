package chaudhry.faizan.mustansar.training.oop.polymorphism;

import chaudhry.faizan.mustansar.training.oop.polymorphism.animal.Animal;
import chaudhry.faizan.mustansar.training.oop.polymorphism.animal.type.FlyingAnimal;
import chaudhry.faizan.mustansar.training.oop.polymorphism.animal.type.TerrestrialAnimal;

import javax.swing.*;

public class PolymorphicMain {
    public static void main(String[] args) {
        Animal dog = new TerrestrialAnimal();
        Animal sparrow = new FlyingAnimal();
        System.out.println("-------------------------");
        System.out.println("Details of the Dog Object");
        System.out.println("-----------------------------");
        dog.breathe(); // The beauty of default method, I had many methods who are different but one(this one) as common
        System.out.println("Can you fly? " + (dog.doesItFly()? "YES": "NO"));
        dog.makesNoise();
        dog.walk();
        System.out.println("-----------------------------");
        System.out.println("Details of the Sparrow Object");
        System.out.println("-----------------------------");
        sparrow.breathe(); // The beauty of default method, I had many methods who are different but one(this one) as common
        System.out.println("Can you fly? " + (sparrow.doesItFly()? "YES": "NO"));
        sparrow.makesNoise();
        sparrow.walk();
    }
}

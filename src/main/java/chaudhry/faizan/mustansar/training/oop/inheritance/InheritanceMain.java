package chaudhry.faizan.mustansar.training.oop.inheritance;

import chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.type.animal.types.FlyingAnimal;
import chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing.type.animal.types.TerrestrialAnimal;

public class InheritanceMain {
    public static void main(String[] args) {
        //Simple inheritance example
        FlyingAnimal bravoBird = new FlyingAnimal(
                "Sparrow",   //LivingBeing attribute
                "Oxygen",   //LivingBeing attribute
                2,            //Animal Attribute
                true,       //Animal Attribute
                2,           //Animal Attribute
                2    // Flying animal attribute
        );
        System.out.println("---------------------------------");
        System.out.println("----- Flying Animal details -----");
        System.out.println("Specie ->"+bravoBird.getSpecie());
        System.out.println("What it uses for breathing ->"+bravoBird.getBreaths());
        System.out.println("How many legs? ->"+bravoBird.getLegs());
        System.out.println("Does it speak ->"+bravoBird.getSpeaks());
        System.out.println("How many eyes? ->"+bravoBird.getEyes());
        System.out.println("How many wings? ->"+bravoBird.getNumberOfWings());
        System.out.println("---------------------------------");
        System.out.println("----- Flying Animal actions -----");
        bravoBird.breathe();    //method defined in living being
        bravoBird.makesNoise(); //method defined in animal
        bravoBird.fly();        //method defined in FlyingAnimal


        TerrestrialAnimal alphaChoupaya = new TerrestrialAnimal(
                "Deer",      //LivingBeing attribute
                "Oxygen",   //LivingBeing attribute
                4,            //Animal Attribute
                true,       //Animal Attribute
                2,           //Animal Attribute
                true    //TerrestrialAnimal attribute
        );
        System.out.println("--------------------------------------");
        System.out.println("----- Terrestrial Animal details -----");
        System.out.println("Specie ->"+alphaChoupaya.getSpecie());
        System.out.println("What it uses for breathing ->"+alphaChoupaya.getBreaths());
        System.out.println("How many legs? ->"+alphaChoupaya.getLegs());
        System.out.println("Does it speak ->"+alphaChoupaya.getSpeaks());
        System.out.println("How many eyes? ->"+alphaChoupaya.getEyes());
        System.out.println("Is the skin usable for humans? ->"+alphaChoupaya.getIsSkinUsage());
        System.out.println("--------------------------------------");
        System.out.println("----- Terrestrial Animal actions -----");
        alphaChoupaya.breathe();    //method defined in living being
        alphaChoupaya.makesNoise(); //method defined in animal
        alphaChoupaya.walk();        //method defined in TerrestrialAnimal

    }
}

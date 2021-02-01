package chaudhry.faizan.mustansar.training.oop.polymorphism.animal;

public interface Animal {
    default void breathe() {
        System.out.println("All animals breathe oxygen o2");
    }
    void walk();
    void makesNoise();
    Boolean doesItFly();
}

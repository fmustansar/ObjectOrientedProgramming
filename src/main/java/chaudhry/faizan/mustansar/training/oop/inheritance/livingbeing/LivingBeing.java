package chaudhry.faizan.mustansar.training.oop.inheritance.livingbeing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class LivingBeing {
    String specie;
    String breaths;
    public void breathe() {
        System.out.println("I am a living being and I breathe");
    }
}

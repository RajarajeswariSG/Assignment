package com.singtel.model;

public class ParrotAction {

    private AnimalSoundEnums animalSoundEnums;

    public ParrotAction(AnimalSoundEnums animalSoundEnums){
        this.animalSoundEnums = animalSoundEnums;
    }

    public void makeSound() {
        System.out.println(animalSoundEnums.getAnimalsSound());
    }

    /**4.D.How do you keep the parrot maintainable? What if we need another parrot
     lives near a Duck?
     /**Based on passing parameters sounds differ**/
    public static void main(String[] args) {
       ParrotAction parrotAction  = new ParrotAction(AnimalSoundEnums.DUCK);
        parrotAction.makeSound();
    }

}

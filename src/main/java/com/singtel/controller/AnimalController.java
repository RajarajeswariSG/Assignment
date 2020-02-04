package com.singtel.controller;

import com.singtel.model.Animal;
import com.singtel.model.AnimalFactory;
import com.singtel.model.AnimalResponse;
import com.singtel.model.RestAnimals;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalController {
    @RequestMapping(value = "/getAllAnimals", method=RequestMethod.GET)
    public List<Animal> getAllAnimals() {
        return RestAnimals.animals;
    }

    @RequestMapping(value = "/stat/{animalName}", method=RequestMethod.GET)
    public AnimalResponse getAnimalStats(@PathVariable("animalName") String animalName ) {
        AnimalResponse animalResponse =  new AnimalResponse();
        Animal animal = AnimalFactory.getAnimal(animalName.toUpperCase());
        if(animal !=  null) {
            animalResponse.setAnimal(new AnimalResponse.AnimalInfo(animal.type(),
                    animal.name(),
                    animal.canSwim() ? "I am Swimming" : "I cannot Swim",
                    animal.canWalk() ? "I am Walking" : "I cannot walk",
                    animal.canSing() ? "I am Singing" : "I cannot sing"));
        }
        return animalResponse;
    }
}
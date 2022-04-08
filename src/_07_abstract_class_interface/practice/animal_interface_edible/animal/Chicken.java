package _07_abstract_class_interface.practice.animal_interface_edible.animal;

import _07_abstract_class_interface.practice.animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "could be fried";
    }


}

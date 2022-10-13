package ss7_abstract_class_interface.practic.AnimalEdible;

public class Tiger extends Animal implements Edible {
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }


    public String howToEat() {
        return "could be fried";
    }
}

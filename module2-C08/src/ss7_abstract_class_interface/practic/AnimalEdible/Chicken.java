package ss7_abstract_class_interface.practic.AnimalEdible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    public String howToEat() {
        return "by  mouth";
    }
}

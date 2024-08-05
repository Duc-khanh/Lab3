package ThucHanh2;

public class Cat extends Animal implements Edible {
    @Override
    public String makeSound() {
        return " Cat: Meow Meow";
    }

    @Override
    public String howToEat() {
        return "mouth";
    }
}

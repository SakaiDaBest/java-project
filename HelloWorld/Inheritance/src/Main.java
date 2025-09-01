public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal",
                "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog Yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(Yorkie, "fast");

        Dog retriever = new Dog("Retriever", 65);
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);// refers to dog if used on dog and got to_String
        System.out.println("_ _ _ _");
    }
}
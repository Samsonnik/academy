package lesson1.homework;

public class AnimalDemo {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("ThisIsCat", 2 );

        // examples of how the code works
        Animal.tellMeAboutAnimal(animal1);
        System.out.println();
        Animal.tellMeAboutAnimal(animal2);
        System.out.println();
        Animal.change(animal2);
        Animal.tellMeAboutAnimal(animal2);

    }
}

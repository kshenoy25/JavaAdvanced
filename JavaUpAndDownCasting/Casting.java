package JavaUpAndDownCasting;

public class Casting  {
    // up casting = taking an object and cast it to its super class type/ parent class
    // down casting = taking an object and cast it to its subtype/ child class
    //                does not happen automatically and has to be done explicitly and can throw exceptions without the
    //                right check

    public static void main (String[] args) {

        // up casting
        // java does all up casting implicitly
        //Animal myAnimal = new Dog();

        //doAnimalStuff(myAnimal);

        //Dog myDog = new Dog();

        Cat myCat = new Cat();
        doAnimalStuff(myCat);



    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();

        // safely down cast use instanceof check
        if (animal instanceof Dog) {
            Dog myDog = (Dog)animal;
            myDog.growl();
        }

    }
}

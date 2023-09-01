// Enumeration for Breed
enum Breed { POODLE, WOLF, CORGEY }

enum Size { SMALL, MEDIUM, LARGE }
public class Dog {

    private String name;
    private int age;
    private String color;
    private double weight;

    private Breed breedType;

    private Size sizeType;

    public Dog(String name, int age, String color, double weight, Breed breedType, Size sizeType) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.breedType = breedType;
        this.sizeType = sizeType;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Breed getBreedType() {
        return breedType;
    }
    public void setBreedType(Breed breedType) {
        this.breedType = breedType;
    }
    public Size getSizeType() {
        return sizeType;
    }
    public void setSizeType(Size sizeType) {
        this.sizeType = sizeType;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    // Main method
    public static void main(String[] args) {
//dog 1
        Dog myDog1 = new Dog("Snoopy", 12, "brown", 20.61, Breed.CORGEY, Size.MEDIUM);
        myDog1.bark();


        System.out.println("Name: " + myDog1.getName());
        System.out.println("Age: " + myDog1.getAge());
        System.out.println("Color: " + myDog1.getColor());
        System.out.println("Weight: " + myDog1.getWeight() + " lbs.");
        System.out.println("Breed: " + myDog1.getBreedType());
        System.out.println("Size: " + myDog1.getSizeType());
//dog 2
        Dog myDog2 = new Dog("Spot", 5, "Black", 13.56,Breed.POODLE, Size.SMALL);
        myDog2.sleep();

        System.out.println("Name: " + myDog2.getName());
        System.out.println("Age: " + myDog2.getAge());
        System.out.println("Color: " + myDog2.getColor());
        System.out.println("Weight: " + myDog2.getWeight() + " lbs.");
        System.out.println("Breed: " + myDog2.getBreedType());
        System.out.println("Size: " + myDog2.getSizeType());
//dog 3
        Dog myDog3 = new Dog("Wolf", 7, "White", 74.43, Breed.WOLF, Size.LARGE);
        myDog3.eat();

        System.out.println("Name: " + myDog3.getName());
        System.out.println("Age: " + myDog3.getAge());
        System.out.println("Color: " + myDog3.getColor());
        System.out.println("Weight: " + myDog3.getWeight() + " lbs.");
        System.out.println("Breed: " + myDog3.getBreedType());
        System.out.println("Size: " + myDog3.getSizeType());
    }
}